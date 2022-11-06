package product.productview.functionview.allsearchproductsview;

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

        showProduct(productManagement.searchName(name));


    }
}
