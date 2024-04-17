package ru.gb.family_tree.model.service.comparators;

import ru.gb.family_tree.model.tree.TreeElement;

import java.util.Comparator;

public class HumanComparatorByName<T extends TreeElement> implements Comparator<T> {

    @Override
    public int compare(T o1, T o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
