package product.productview.functionview.allsort;

import product.Product;

import java.util.Comparator;

public class ComparatorByName implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
        int n = (o1.getName().toUpperCase().compareTo(o2.getName().toUpperCase()) > 0) ? 1
                : o1.getName().toUpperCase().compareTo(o2.getName().toUpperCase()) == 0 ? 0 : -1;
        return n;
    }
}
