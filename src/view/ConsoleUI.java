package view;

import java.util.Scanner;

import human.sort.SortByAge;
import human.sort.SortByName;
import presenter.Presenter;

public class ConsoleUI implements View {
    private Presenter presenter;
    private Scanner scanner;
    private boolean work;
    private MainMenu menu;

    public ConsoleUI() {
        presenter = new Presenter(this);
        scanner = new Scanner(System.in);
        work = true;
        menu = new MainMenu(this);
    }

    @Override
    public void start() {
        System.out.println("Здавствуйте");
        while(work){
            System.out.println(menu.menu());
            String choice = scanner.nextLine();
            int numChoice = Integer.parseInt(choice);
            menu.execute(numChoice);
        }
    }
    public void addHuman(){
        System.out.println("Введите имя человека");
        String name = scanner.nextLine();
        System.out.println("Укажите возраст челолвека");
        String ageString = scanner.nextLine();
        int age = Integer.parseInt(ageString);
        presenter.addHuman(name, age);
    }

    public void getGeoInfo(){
        presenter.getGeoInfo();
    }

    public void sortByName() {
        presenter.SortByName();
    }

    public void sortByAge() {
        presenter.SortByAge();
    }

    public void finish() {
        System.out.println("До скорых встреч");
        work = false;
    }
}
