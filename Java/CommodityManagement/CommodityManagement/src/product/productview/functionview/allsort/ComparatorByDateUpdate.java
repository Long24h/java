package product.productview.functionview.allsort;

import product.Product;

import java.util.Comparator;

public class ComparatorByDateUpdate implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
        int n = (o1.getDateUpdate().compareTo(o2.getDateUpdate()) > 0) ? 1
                : o1.getDateUpdate().compareTo(o2.getDateUpdate()) == 0 ? 0 : -1;
        return n;
    }
}
