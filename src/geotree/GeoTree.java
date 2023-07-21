package geotree;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.ArrayList;

import javax.swing.text.html.HTMLDocument.Iterator;

import human.Human;
import human.sort.SortByAge;

public class GeoTree<E extends GeoTreeItem<E>> implements Serializable, Iterable<E> {
    private ArrayList<E> tree = new ArrayList<>();

    public GeoTree(ArrayList<E> tree){ this.tree = tree; }

    public GeoTree(){ this(new ArrayList<>()); }

    public ArrayList<Link> getTree() {
        return tree;
    }

    public void appendPerentChild(Human parent, Human children) {
        tree.add(new Link(parent, Relationship.parent, children));
        tree.add(new Link(children, Relationship.children, parent));
    }

    public void appendVifeHusbent(Human vife, Human husbent) {
        tree.add(new Link(vife, Relationship.vife, husbent));
        tree.add(new Link(husbent, Relationship.husbent, vife));
    }
    
    @Override
    public Iterator<E> iterator(){
        return new HumanIterator(tree);
    }

    public void SortByName(){
        tree.sort(new SortByName<>());
    }

    public void SortByAge(){
        tree.sort(new SortByAge<>());
    }
}