package ru.gb.family_tree.tree;

import ru.gb.family_tree.human.Human;

import java.util.ArrayList;
import java.util.List;

public class Tree {
    private List<Human> familyList;


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
}
