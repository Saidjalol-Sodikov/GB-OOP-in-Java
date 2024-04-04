package ru.gb.family_tree.service;

import ru.gb.family_tree.human.Gender;
import ru.gb.family_tree.human.Human;
import ru.gb.family_tree.tree.Tree;

import java.time.LocalDate;

public class Service {
    private int genId;

    public void addHuman (String name, LocalDate dob, Gender gender, Tree tree){
        Human human = new Human(name, dob, gender);
        if (tree != null ) {
            human.setId(tree.getFamilyList().size()-1 + genId++);
        } else {
            human.setId(genId++);
        }
        tree.addHuman(human);
    }

    public void addHuman (Human human, Tree tree) {
        addHuman(human.getName(), human.getDob(), human.getGender(), tree);
    }

}
