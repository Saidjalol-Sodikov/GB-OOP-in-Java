package ru.gb.family_tree;

import java.time.LocalDate;
import ru.gb.family_tree.human.Gender;
import ru.gb.family_tree.human.Human;
import ru.gb.family_tree.tree.Tree;

public class Main {

    public static void main(String[] args) {
        Tree familyTree1 = new Tree();

        Human human01 = new Human("Саид", LocalDate.of(2000,11,13), Gender.MALE);
        Human human02 = new Human("Мадина", LocalDate.of(2004, 6, 11), Gender.FEMALE);
        Human human03 = new Human("Улугбек", LocalDate.of(1974, 7, 2), Gender.MALE);
        Human human04 = new Human("Мавлюда", LocalDate.of(1980,3,18),Gender.FEMALE);
        Human human05 = new Human("Садыкжан", LocalDate.of(1956, 8, 18), Gender.MALE);
        Human human06 = new Human("Улфатхон", LocalDate.of(1980,3,18),Gender.FEMALE);
        Human human07 = new Human("Кобилжон", LocalDate.of(1960,6,1),Gender.MALE);
        Human human08 = new Human("Мавжуда", LocalDate.of(1960,4,14),Gender.FEMALE);

        human08.addChild(human04);
        human07.addChild(human04);
        human06.addChild(human03);
        human05.addChild(human03);
        human04.addChild(human02);
        human04.addChild(human01);
        human03.addChild(human02);
        human03.addChild(human01);
        
        human06.setDod(LocalDate.of(2014,12,12));
        human05.setDod(LocalDate.of(2013,11,20));

        // Проверка "полного" конструктора
        Human human00 = new Human("Мис Х", LocalDate.of(1982, 10, 10),LocalDate.of(1998,10,10),Gender.FEMALE,human04.getChildren(),human06,human05);


        familyTree1.addHuman(human08);
        familyTree1.addHuman(human07);
        familyTree1.addHuman(human06);
        familyTree1.addHuman(human05);
        familyTree1.addHuman(human04);
        familyTree1.addHuman(human03);
        familyTree1.addHuman(human02);
        familyTree1.addHuman(human01);

        // Показываем одного человека
        //System.out.println(human00);

        // Показываем семейное древо
        //System.out.print(familyTree1);

        // Показывает имена детей в виде строки
        //System.out.println(human04.getChildrenNames());

        // Поиск по имени
        //System.out.println(familyTree1.getByName("Саид"));

        // Показывает детей
        // System.out.println(human04.getChildren());


    }

}
