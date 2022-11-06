package product.productview.functionview.allsort;

import product.Product;

import java.util.Comparator;

public class ComparatorByDateCreate implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
        int n = (o1.getDateCreate().compareTo(o2.getDateCreate()) > 0) ? 1
                : o1.getDateCreate().compareTo(o2.getDateCreate()) == 0 ? 0 : -1;
        return n;
    }
}
