package geotree;

import java.util.Iterator;
import java.util.List;

import human.Human;

public class HumanIterator<E> implements Iterator<Human> {
    private int index;
    private List<Human> tree;

    public HumanIterator(List<E> tree){
        this.tree = tree;
    }

    @Override
    public boolean hasNext() {
        return index < tree.size();
    }

    @Override
    public Human next() {
        return tree.get(index++);
    }
}
