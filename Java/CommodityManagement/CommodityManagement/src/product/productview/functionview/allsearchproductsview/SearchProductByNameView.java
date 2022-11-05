package product.productview.functionview.allsearchproductsview;

import product.Product;
import product.productview.ProductTemplate;

import java.util.ArrayList;

public class SearchProductByNameView extends ProductTemplate {
    public SearchProductByNameView(){

    }
    @Override
    protected void showBody() {
        System.out.println("Enter product's name to search:");
        String name = scanner.nextLine();

        productManagement.searchProductByName(name);

        ArrayList<Product> sameName = new ArrayList<>();

    }
}
