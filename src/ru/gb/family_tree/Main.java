package ru.gb.family_tree;

import ru.gb.family_tree.human.Gender;
import ru.gb.family_tree.human.Human;
import ru.gb.family_tree.tree.Tree;

import java.awt.*;
import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        Tree familyTree1 = new Tree();

        List list1 = new List();
        Human human01 = new Human("Улугбек", LocalDate.of(1974, 7, 2), Gender.Male);

        System.out.println(human01);

    }

}
