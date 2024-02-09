package seminars.drugStore;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PharmacyIterable implements Iterable<Component>, Comparable<PharmacyIterable> {
    private List<Component> components;
    private int ind;
    private int size = 0;
    private int sum = 0;

    public PharmacyIterable() {
        this.components = new ArrayList<>();
        this.ind = 0;
    }

    public PharmacyIterable addCompopent(Component item) {
        components.add(item);
        sum += item.getPower();
        size++;
        return this;
    }

    // public int sumPower() {
    //     int sum = 0;
    //     for (Component component : this.components) {
    //         sum += component.getPower();
    //     }
    //     return sum;
    // }

    public int getSum() {
        return sum;
    }

    public int getSize() {
        return size;
    }

    public List<Component> getComponents() {
        return components;
    }

    @Override
    public Iterator<Component> iterator() {
        // return new Iterator<Component>() {
        //     @Override
        //     public boolean hasNext() {
        //         return ind < components.size();
        //     }
        //     @Override
        //     public Component next() {
        //         return components.get(ind++);
        //     }
        // };
        return new MyIterator(this);
    }

    // @Override
    // public String toString() {
    //     return String.format("%s\n", components);
    // }

    // для удобства вывода сортировки
    public String toString() {
        return String.format("sumPower: %s", sum);
    }

    @Override
    public int compareTo(PharmacyIterable phi) {

        // 1 СПОСОБ (БЕЗ ДОПОЛНИТЕЛЬНОГО ПОЛЯ В КЛАССЕ, НО ЕСТЬ ДОПОЛНИТЕЛЬНЫЙ МЕТОД)
        // if (this.sumPower() > phi.sumPower()) return 1;
        // else if (this.sumPower() < phi.sumPower()) return -1;
        // else return 0;

        // 2 СПОСОБ (С ДОПОЛНИТЕЛЬНЫМ ПОЛЕМ И GET-ером)
        if (this.sum > phi.getSum()) return 1;
        else if (this.sum < phi.getSum()) return -1;
        else return 0;
    }
}
