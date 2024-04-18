package ru.gb.family_tree.view.command;

import ru.gb.family_tree.view.ConsoleUI;

public class SortByAge extends Command {
    public SortByAge(ConsoleUI consoleUI) {
        super("Сортировать по возрасту.", consoleUI);
    }

    @Override
    public void execute() {
        super.getConsoleUI().sortByAge();
    }
}
