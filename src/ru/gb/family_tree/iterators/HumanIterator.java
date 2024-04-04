package ru.gb.family_tree.iterators;

import ru.gb.family_tree.human.Human;

import java.util.Iterator;
import java.util.List;

public class HumanIterator implements Iterator {

    private int index;
    private List<Human> familyList;

    public HumanIterator(List<Human> familyList) {
        this.familyList = familyList;
    }

    @Override
    public boolean hasNext() {
        return index < familyList.size();
    }

    @Override
    public Object next() {
        return familyList.get(index++);
    }
}
