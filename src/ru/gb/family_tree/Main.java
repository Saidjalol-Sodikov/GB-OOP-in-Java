package ru.gb.family_tree;

import ru.gb.family_tree.human.Gender;
import ru.gb.family_tree.human.Human;
import ru.gb.family_tree.service.Service;
import ru.gb.family_tree.tree.Tree;
import ru.gb.family_tree.writer.FileHandler;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        String filePath = "src/ru/gb/family_tree/writer/tree.sav";

        Service service = new Service();
        //Tree tree = testTree();
        Tree tree = read(filePath);

        //System.out.println(service.getTreeInfo(tree));

        service.sortByName(tree);

        System.out.println(service.getTreeInfo(tree));

        //service.sortByAge(tree);

        //System.out.println(service.getTreeInfo(tree));

        //save(tree, filePath);



    }

    static void save (Tree tree, String filePath){
        FileHandler fileHandler = new FileHandler();
        fileHandler.save(tree, filePath);
    }

    static Tree read(String filePath) {
        FileHandler fileHandler = new FileHandler();
        return (Tree) fileHandler.read(filePath);
    }

    static Tree testTree () {
        Service service = new Service();
        Tree tree = new Tree();

        Human Misha = new Human("Миша", LocalDate.of(2002, 1, 1 ), Gender.MALE);
        Human Dasha = new Human("Даша", LocalDate.of(2005, 1, 1 ), Gender.FEMALE);
        Human Aleksandr = new Human("Александр", LocalDate.of(1982, 1, 1 ), Gender.MALE);
        Human Vasilisa = new Human("Василиса", LocalDate.of(1984, 1, 1 ), Gender.FEMALE);

        Aleksandr.addChild(Misha);
        Vasilisa.addChild(Misha);
        Aleksandr.addChild(Dasha);
        Vasilisa.addChild(Dasha);

        service.addHuman(Aleksandr, tree);
        service.addHuman(Misha, tree);
        service.addHuman(Vasilisa, tree);
        service.addHuman(Dasha, tree);

        return tree;
    }
}
