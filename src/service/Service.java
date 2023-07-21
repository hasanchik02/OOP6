package service;

import geotree.GeoTree;
import human.Human;

public class Service {
    private int idHuman;
    private GeoTree<Human> group;

    public Service() { group = new GeoTree<>(); }

    public void addHuman(String name, int age){
        Human human = new Human(idHuman++, name, age);
        group.addHuman(human);
    }

    public String getGeoInfo() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Список древа:\n");

        for (Human human: group){
            stringBuilder.append(human);
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }
}
