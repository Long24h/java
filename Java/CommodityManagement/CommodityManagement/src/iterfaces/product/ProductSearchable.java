package iterfaces.product;

import iterfaces.Searchable;
import product.Product;
import product.productmanagement.ProductManagement;

import java.util.ArrayList;

public class ProductSearchable implements Searchable<Product> {


    @Override
    public ArrayList<Product> searchBy(ArrayList<Product> list, int id) {
        ArrayList<Product> list1 = new ArrayList<>();
        for (Product product : list) {
            if (product.getId() == id) {
                list1.add(product);
            }
        }
        return list1;
    }

}
