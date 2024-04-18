package ru.gb.family_tree.view.command;

import ru.gb.family_tree.view.ConsoleUI;

public class Finish extends Command {
    public Finish(ConsoleUI consoleUI) {
        super("Выход.", consoleUI);
    }

    @Override
    public void execute() {
        super.getConsoleUI().finish();
    }
}
