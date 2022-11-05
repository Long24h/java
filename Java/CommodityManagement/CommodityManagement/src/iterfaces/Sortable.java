package iterfaces;

import java.util.Comparator;

public interface Sortable extends Comparator {
    void sortId(int id);
    void sortName(String name);
}
