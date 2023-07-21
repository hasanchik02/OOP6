package view.commands;

import view.ConsoleUI;

public class SortByName extends Command {
    public sortByName(ConsoleUI consoleUI) {
        super(consoleUI, "Отсортировать список по имени");
    }

    public void execute() { 
        consoleUI.sortByName();
    }
}
