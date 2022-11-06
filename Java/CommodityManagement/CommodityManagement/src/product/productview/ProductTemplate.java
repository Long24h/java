package product.productview;

import product.Product;
import product.productmanagement.ProductManagement;
import view.ViewTemplate;

import java.util.ArrayList;
import java.util.Comparator;

public abstract class ProductTemplate extends ViewTemplate {
    protected ProductManagement productManagement;

    protected Comparator<Product> comparator;
    public ProductTemplate(){
        productManagement = new ProductManagement();
    }
    public static void showProduct(ArrayList<Product> productslist){
        for (Product product : productslist) {
            System.out.println(product);
        }
    }
}
