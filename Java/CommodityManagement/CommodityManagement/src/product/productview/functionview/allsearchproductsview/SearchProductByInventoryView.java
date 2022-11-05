package product.productview.functionview.allsearchproductsview;

import product.productview.ProductTemplate;

public class SearchProductByInventoryView extends ProductTemplate {
    public SearchProductByInventoryView(){

    }
    @Override
    protected void showBody() {
        System.out.println("Enter product's inventory to search:");
        float inventory = Float.parseFloat(scanner.nextLine());

        productManagement.searchProductByInventory(inventory);
    }
}
