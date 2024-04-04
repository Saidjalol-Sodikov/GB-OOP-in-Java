package ru.gb.family_tree;

import ru.gb.family_tree.service.Service;
import ru.gb.family_tree.tree.Tree;
import ru.gb.family_tree.writer.FileHandler;

public class Main {

    public static void main(String[] args) {
        String filePath = "src/ru/gb/family_tree/writer/tree.sav";

        Service tree = new Service();



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
