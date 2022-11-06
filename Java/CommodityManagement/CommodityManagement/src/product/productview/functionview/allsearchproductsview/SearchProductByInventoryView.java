package product.productview.functionview.allsearchproductsview;

import product.productmanagement.ProductManagement;
import product.productview.ProductTemplate;

public class SearchProductByInventoryView extends ProductTemplate {
    public SearchProductByInventoryView(){

    }
    @Override
    protected void showBody() {
        System.out.println("Enter product's inventory to search:");
        int inventory = Integer.parseInt(scanner.nextLine());

        showProduct(productManagement.searchInventory(inventory));
    }
}
