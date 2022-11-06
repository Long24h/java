package product.productview.functionview.allsearchproductsview;


import product.Product;
import product.productmanagement.ProductManagement;
import product.productview.ProductTemplate;

import java.util.ArrayList;

public class SearchProductByEntryPriceView extends ProductTemplate{
    public SearchProductByEntryPriceView(){
        showBody();
    }
    @Override
    protected void showBody() {
        System.out.println("Enter product's entry price to search:");
        int entryPrice = Integer.parseInt(scanner.nextLine());

        productManagement.searchEntryPrice(entryPrice);
    }
}
