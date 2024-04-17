package ru.gb.family_tree.view;

import ru.gb.family_tree.presenter.Presenter;

import java.util.Scanner;

public class ConsoleUI implements View{
    private Scanner scanner;
    private Presenter presenter;

    private boolean end;

    public ConsoleUI() {
        scanner = new Scanner(System.in);
        presenter = new Presenter(this);
        end = true;
    }

    @Override
    public void start() {


        while (end) {

            presenter.addHuman("Name", 10, 12, 2000, "")
        }
    }

    @Override
    public void printAnswer(String text) {
        System.out.println(text);
    }


}
