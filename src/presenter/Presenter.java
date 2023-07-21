package presenter;

import javax.swing.text.View;

import service.Service;

public class Presenter {
    private View view;
    private Service service;

    public Presenter(View view){
        this.view = view;
        service = new Service();
    }

    public void addHuman(String name, int age){
        service.addHuman(name, age);
        view.printAnswer(service.getGeoInfo());
    }
    public void getGeoInfo(){
        String answer = service.getGeoInfo();
        view.printAnswer(answer);
    }
    public void SortByName() {
        service.SortByName();
        getGeoInfo();
    }
    public void SortByAge() {
        service.SortByAge();
        getGeoInfo();
    }
}
