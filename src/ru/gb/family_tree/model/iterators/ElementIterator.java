package ru.gb.family_tree.model.iterators;

import ru.gb.family_tree.model.tree.TreeElement;

import java.util.Iterator;
import java.util.List;

public class ElementIterator<T extends TreeElement> implements Iterator<T> {

    private int index;
    private List<T> familyList;

    public ElementIterator(List<T> familyList) {
        this.familyList = familyList;
    }

    @Override
    public boolean hasNext() {
        return index < familyList.size();
    }

    @Override
    public T next() {
        return familyList.get(index++);
    }
}
