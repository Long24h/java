package product.productview.functionview.allsearchproductsview;

import product.productmanagement.ProductManagement;
import product.productview.ProductTemplate;

public class SearchProductBySupplierView extends ProductTemplate {
    public SearchProductBySupplierView(){
        showBody();
    }
    @Override
    protected void showBody() {
        System.out.println("Enter product's supplier to search:");
        String supplier = scanner.nextLine();

        productManagement.searchSupplier(supplier);
    }
}
