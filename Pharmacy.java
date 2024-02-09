package seminars.drugStore;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Pharmacy implements Iterator<Component> {
    private List<Component> components;
    private int ind;

    public Pharmacy() {
        this.components = new ArrayList<>();
        this.ind = 0;
    }

    public Pharmacy addCompopent(Component item) {
        components.add(item);
        return this;
    }

    @Override
    public boolean hasNext() {
        return ind < components.size();
    } 

    @Override
    public Component next() {
        return components.get(ind++);
    }
}