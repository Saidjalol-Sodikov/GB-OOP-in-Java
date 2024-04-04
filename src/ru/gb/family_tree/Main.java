package ru.gb.family_tree;

import java.io.Serializable;
import java.time.LocalDate;

import ru.gb.family_tree.human.Gender;
import ru.gb.family_tree.human.Human;
import ru.gb.family_tree.tree.Tree;
import ru.gb.family_tree.writer.FileHandler;

public class Main {

    public static void main(String[] args) {
        String filePath = "src/ru/gb/family_tree/writer/tree.sav";

        Tree testTree1 = read(filePath);
        System.out.println(testTree1);




        save(testTree1, filePath);

    }

    static void save (Tree tree, String filePath){
        FileHandler fileHandler = new FileHandler();
        fileHandler.save(tree, filePath);
    }

    static Tree read(String filePath) {
        FileHandler fileHandler = new FileHandler();
        return (Tree) fileHandler.read(filePath);
    }

}
