package ru.gb.family_tree;

import ru.gb.family_tree.view.ConsoleUI;
import ru.gb.family_tree.view.View;

public class Main {

    public static void main(String[] args) {

        View view = new ConsoleUI();
        view.start();
    }
}
