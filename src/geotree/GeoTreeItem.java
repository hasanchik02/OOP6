package geotree;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

public interface GeoTreeItem<T> extends Serializable {
    T getFather();
    T getMother();
    boolean addChild(T human);
    boolean addParents(T human);
    String getName();
    LocalDate getBirthDate();
    List<T> getParents();
    List<T> getChildren();
}
