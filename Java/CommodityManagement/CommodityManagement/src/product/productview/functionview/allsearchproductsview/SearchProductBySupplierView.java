package product.productview.functionview.allsearchproductsview;

import product.productview.ProductTemplate;

public class SearchProductBySupplierView extends ProductTemplate {
    public SearchProductBySupplierView(){

    }
    @Override
    protected void showBody() {
        System.out.println("Enter product's supplier to search:");
        String supplier = scanner.nextLine();

        productManagement.searchSupplier(supplier);
    }
}
