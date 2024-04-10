package ru.gb.family_tree.tree;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ru.gb.family_tree.human.Human;
import ru.gb.family_tree.service.comparators.HumanComparatorByAge;
import ru.gb.family_tree.service.comparators.HumanComparatorByName;

public class Tree implements Serializable, Iterable<Human> {
    private final List<Human> familyList;
    
    public Tree() {
        familyList = new ArrayList<>();
    }

    public List<Human> getFamilyList() {
        return familyList;
    }

    public void addHuman(Human human){
        familyList.add(human);
    }

    @Override
    public String toString() {
        return getInfo();
    }

    private String getInfo() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Члены семьи:\n");
        for (Human human : familyList) {
            stringBuilder.append(human);
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }
    public Human getByName(String name){
        for (Human human : this.familyList) {
            if (human.getName().equals(name)) {
                return human;
            }
        }
        return null;
    }

    public void sortByName() {
        this.getFamilyList().sort(new HumanComparatorByName());
    }

    public void sortByAge() {
        this.getFamilyList().sort(new HumanComparatorByAge());
    }


    @Override
    public Iterator<Human> iterator() {
        //return new HumanIterator(familyList);
        return familyList.iterator();
    }

    ////TODO Вывести список членов семьи в виде таблицы
    // private String getLikeTable (List<Human> familyList){
        
    //     return null;
    // }
    
    // //TODO Вывести список членов семьи в виде дерева
    // private String getLikeTree (List<Human> familyList) {
        
    //     return null;
    // }
}
