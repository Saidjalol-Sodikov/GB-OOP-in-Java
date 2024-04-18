package ru.gb.family_tree.view.command;

import ru.gb.family_tree.view.ConsoleUI;

public class AddParent extends Command {
    public AddParent(ConsoleUI consoleUI) {
        super("Добавить родителя по ID.", consoleUI);
    }

    @Override
    public void execute() {
        this.getConsoleUI().addParent();
    }
}
