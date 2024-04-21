package ru.gb.family_tree.model.tree;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import ru.gb.family_tree.model.service.comparators.HumanComparatorByAge;
import ru.gb.family_tree.model.service.comparators.HumanComparatorByName;

public class Tree<E extends TreeElement> implements Serializable, Iterable<E> {
    private final List<E> familyList;
    
    public Tree() {
        familyList = new ArrayList<>();
    }

    public List<E> getFamilyList() {
        return familyList;
    }

    public void addHuman(E element){
        familyList.add(element);
    }

    @Override
    public String toString() {
        return getInfo();
    }

    private String getInfo() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Члены семьи:\n");
        for (E element : familyList) {
            stringBuilder.append(element);
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }
    public E getByName(String name){
        for (E element : this.familyList) {
            if (element.getName().equals(name)) {
                return element;
            }
        }
        return null;
    }

    public void sortByName() {
        this.getFamilyList().sort(new HumanComparatorByName<>());
    }

    public void sortByAge() {
        this.getFamilyList().sort(new HumanComparatorByAge<>());
    }


    @Override
    public Iterator<E> iterator() {
        //return new HumanIterator(familyList);
        return familyList.iterator();
    }

}
