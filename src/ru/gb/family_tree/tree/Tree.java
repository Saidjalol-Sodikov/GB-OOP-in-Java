package ru.gb.family_tree.tree;

import java.util.ArrayList;
import java.util.List;
import ru.gb.family_tree.human.Human;

public class Tree {
    private List<Human> familyList;
    
    public Tree() {
        familyList = new ArrayList<>();
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

    private String getLikeTable (List<Human> familyList){
        
        return null;
    }
    
    private String getLikeTree (List<Human> familyList) {
        
        return null;
    }
}
