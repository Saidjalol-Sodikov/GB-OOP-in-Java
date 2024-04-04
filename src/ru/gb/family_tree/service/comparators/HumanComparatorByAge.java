package ru.gb.family_tree.service.comparators;

import ru.gb.family_tree.human.Human;

import java.util.Comparator;

public class HumanComparatorByAge implements Comparator<Human> {

    @Override
    public int compare(Human o1, Human o2) {
        // return o1.getAge()-o2.getAge();
        return Integer.compare(o1.getAge(), o2.getAge());
    }
}
