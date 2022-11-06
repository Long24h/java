package product.productview.functionview.allsearchproductsview;

import product.Product;
import product.productmanagement.ProductManagement;
import product.productview.ProductTemplate;

import java.util.ArrayList;

public class SearchProductByNameView extends ProductTemplate {
    public SearchProductByNameView(){
        showBody();
    }
    @Override
    protected void showBody() {
        System.out.println("Enter product's name to search:");
        String name = scanner.nextLine();

        System.out.println(productManagement.searchName(name));;

//        ArrayList<Product> sameName = new ArrayList<>();

    }
}
