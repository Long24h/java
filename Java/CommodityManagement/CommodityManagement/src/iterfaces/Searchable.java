package iterfaces;

import product.Product;

import java.util.ArrayList;

public interface Searchable<T> {
        ArrayList<T> searchBy(ArrayList<T> t, int id);
}
