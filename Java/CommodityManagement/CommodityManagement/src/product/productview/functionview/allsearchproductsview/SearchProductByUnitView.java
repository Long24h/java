package product.productview.functionview.allsearchproductsview;

import product.productview.ProductTemplate;

public class SearchProductByUnitView extends ProductTemplate {
    public SearchProductByUnitView(){

    }
    @Override
    protected void showBody() {
        System.out.println("Enter product's unit to search:");
        String unit = scanner.nextLine();

        productManagement.searchProductByUnit(unit);
    }
}
