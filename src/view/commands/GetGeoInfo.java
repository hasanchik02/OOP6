package view.commands;

import view.ConsoleUI;

public class GetGeoInfo extends Command {
    
    public getGeoInfo(ConsoleUI consoleUI) {
        super(consoleUI,"Получить список людей в древе" );
    }

    public void execute() {
        consoleUI.getGeoInfo();
    }
}
