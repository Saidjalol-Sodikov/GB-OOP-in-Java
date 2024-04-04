package ru.gb.family_tree.tree;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import ru.gb.family_tree.human.Human;

public class Tree implements Serializable{
    private List<Human> familyList;
    
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
            if (human.getName() == name) {
                return human;
            }
        }
        return null;
    }

    // //TODO Вывести список членов семьи в виде таблицы
    // private String getLikeTable (List<Human> familyList){
        
    //     return null;
    // }
    
    // //TODO Вывести список членов семьи в виде дерева
    // private String getLikeTree (List<Human> familyList) {
        
    //     return null;
    // }
}
