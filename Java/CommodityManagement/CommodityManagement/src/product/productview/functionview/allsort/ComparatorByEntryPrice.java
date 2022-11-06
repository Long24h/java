package product.productview.functionview.allsort;

import product.Product;

import java.util.Comparator;

public class ComparatorByEntryPrice implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
        int n = (o1.getEntryPrice() > o2.getEntryPrice()) ? 1 : o1.getEntryPrice() == o2.getEntryPrice() ? 0 : -1;
        return n;
    }
}
