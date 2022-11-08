package product.productview.functionview.allsearchproductsview;

import product.productview.ProductTemplate;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class SearchProductByNameView extends ProductTemplate {
    public SearchProductByNameView(){
    }
    @Override
    protected void showBody() {
                System.out.println("Enter product's name to search:");
                String name = scanner.nextLine();
                List list = productManagement.searchName(name);

                if (list == null) {
                    System.out.println("The product with name \"" + name + "\" does not exist!");
                } else {
                    showProduct(list);
                }
    }
}
