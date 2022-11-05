package utils;

import product.Product;

import java.util.Comparator;

public class SortById implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
        int n = (o1.getName().compareToIgnoreCase(o2.getName()) > 0) ? 1 :
                o1.getName().compareToIgnoreCase(o2.getName()) == 0 ? 0 : -1;
//        if (o1.getName().compareToIgnoreCase(o2.getName()) > 0){
//            return 1;
//        } else if (o1.getName().compareToIgnoreCase(o2.getName()) == 0){
//            return 0;
//        } else {
//            return -1;
//        }
        return n;
    }
}
