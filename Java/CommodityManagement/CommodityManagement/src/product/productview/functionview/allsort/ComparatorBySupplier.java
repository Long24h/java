package product.productview.functionview.allsort;

import product.Product;

import java.util.Comparator;

public class ComparatorBySupplier implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
        int n = (o1.getSupplier().compareToIgnoreCase(o2.getSupplier())) > 0 ? 1
                : o1.getSupplier().compareToIgnoreCase(o2.getSupplier()) == 0 ? 0 : -1;
        return 0;
    }
}
