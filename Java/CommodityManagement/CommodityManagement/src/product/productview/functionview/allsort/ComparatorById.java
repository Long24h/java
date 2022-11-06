package product.productview.functionview.allsort;

import product.Product;

import java.util.Comparator;

public class ComparatorById implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
        int n = (o1.getId() > o2.getId()) ? 1 : o1.getId() == o2.getId() ? 0 : -1;
        return n;
    }
}
