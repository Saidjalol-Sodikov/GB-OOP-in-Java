package ru.gb.family_tree.service;

import ru.gb.family_tree.human.Gender;
import ru.gb.family_tree.human.Human;
import ru.gb.family_tree.service.comparators.HumanComparatorByAge;
import ru.gb.family_tree.service.comparators.HumanComparatorByName;
import ru.gb.family_tree.tree.Tree;

import java.time.LocalDate;
import java.util.Collections;

public class Service {
    private int genId;

    public void addHuman (String name, LocalDate dob, Gender gender, Tree tree){
        Human human = new Human(name, dob, gender);
        human.setId(genId++);
        tree.addHuman(human);
    }

    public void addHuman (Human human, Tree tree) {
        addHuman(human.getName(), human.getDob(), human.getGender(), tree);
    }

    public String getTreeInfo (Tree tree){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Список членов семьи\n");
        for (Object human : tree){
            stringBuilder.append(human);
            stringBuilder.append("\n");
        }

        return stringBuilder.toString();
    }

    public void sortByName(Tree tree) {
        tree.sortByName();
    }

    public void sortByAge(Tree tree) {
        tree.sortByAge();
    }

}
