package seminars.drugStore;

import java.util.Iterator;

public class MyIterator implements Iterator<Component> {
    private PharmacyIterable pharmacyIterable;
    private int index = 0;

    public MyIterator(PharmacyIterable pharmacyIterable) {
        this.pharmacyIterable = pharmacyIterable;
    }

    @Override
    public boolean hasNext() {
        return index < pharmacyIterable.getSize();
    }

    @Override
    public Component next() {
        return pharmacyIterable.getComponents().get(index++);
    }
}