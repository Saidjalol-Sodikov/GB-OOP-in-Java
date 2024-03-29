package ru.gb.family_tree;

import ru.gb.family_tree.human.Gender;
import ru.gb.family_tree.human.Human;
import ru.gb.family_tree.tree.Tree;

import java.awt.*;
import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        Tree familyTree1 = new Tree();

        Human human01 = new Human("Саид", LocalDate.of(2000,11,13), Gender.Male);
        Human human02 = new Human("Мадина", LocalDate.of(2004, 6, 11), Gender.Female);
        Human human03 = new Human("Улугбек", LocalDate.of(1974, 7, 2), Gender.Male);
        Human human04 = new Human("Мавлюда", LocalDate.of(1980,3,18),Gender.Female);
        Human human05 = new Human("Садыкжан", LocalDate.of(1956, 8, 18), Gender.Male);
        Human human06 = new Human("Улфатхон", LocalDate.of(1980,3,18),Gender.Female);

        human03.addChild(human02);
        human04.addChild(human02);
        human03.addParent(human06);
        human03.addParent(human05);

        System.out.println(human03);

    }

}
