import geotree.GeoTree;
import geotree.Link;
import geotree.Relationship;
import human.Human;
import human.sort.SortByAge;
import serializable.FileHandler;
import view.ConsoleUI;

public class Main {
    public static void main(String[] args) {
        View view = new ConsoleUI();
        view.start();
       FileHandler fileHandler = new FileHandler();
       
       GeoTree tree = testGeoTree();
       System.out.println(tree);

       fileHandler.save(tree, "src/tree.out");
    }
    static GeoTree testGeoTree(){
    Human irina = new Human("Ирина", 56);
    Human igor = new Human("Игорь", 60);
    Human vasya = new Human("Вася", 30);
    Human masha = new Human("Маша", 27);
    Human jane = new Human("Женя", 10);
    Human ivan = new Human("Ваня", 8);
    Human sasha = new Human("Саша", 9);
    Human slava = new Human("Слава", 10);
    Human dima = new Human("Дима", 11);
    Human andrey = new Human("Андрей", 3);
    
    GeoTree geoTree = new GeoTree();
    geoTree.appendVifeHusbent(irina, vasya);
    geoTree.appendPerentChild(irina, masha); 
    geoTree.appendPerentChild(irina, masha); 
    geoTree.appendPerentChild(vasya, jane); 
    geoTree.appendPerentChild(vasya, ivan); 
    geoTree.appendVifeHusbent(irina, igor); 
    geoTree.appendPerentChild(igor, vasya); 
    geoTree.appendPerentChild(igor, masha); 
    geoTree.appendPerentChild(igor, sasha); 
    geoTree.appendPerentChild(igor, slava); 
    geoTree.appendPerentChild(igor, dima);  
    geoTree.appendPerentChild(igor, andrey);
    
    System.out.println("Дети Ирины");
    System.out.println(new Research(gt).spend(irina, Relationship.parent));
       
    System.out.println("Дети Васи");
    System.out.println(new Research(gt).spend(vasya, Relationship.parent));

        
    System.out.println("Жена Игоря");
    System.out.println(new Research(gt).spend(igor, Relationship.vife));

    } 
}
