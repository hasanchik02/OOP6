package view.commands;

import view.ConsoleUI;

public abstract class Command {
    ConsoleUI consoleUI;
    private String description;

    public Command(ConsoleUI consoleUI, String description) {
        this.consoleUI = consoleUI;
        this.description = description;
    }

    public String getDescription() { 
        return description;
    }

    public abstract void execute();
}
