package product.productview;

import product.Product;
import product.productmanagement.ProductManagement;
import view.ViewTemplate;

import java.util.ArrayList;

public abstract class ProductTemplate extends ViewTemplate {
    protected ProductManagement productManagement;
    public ProductTemplate(){
        productManagement = new ProductManagement();
    }
    public void showProduct(ArrayList<Product> productslist){
        for (Product product : productslist) {
            System.out.println(product);
        }
    }
}
