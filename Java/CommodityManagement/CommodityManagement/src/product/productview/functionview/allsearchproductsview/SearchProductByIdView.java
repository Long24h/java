package product.productview.functionview.allsearchproductsview;

import product.productview.ProductTemplate;

public class SearchProductByIdView extends ProductTemplate {
    public SearchProductByIdView(){

    }
    @Override
    protected void showBody() {
        idSearch();

    }
    private void idSearch(){
        System.out.println("Enter product's ID to search:");
        int id = Integer.parseInt(scanner.nextLine());

        System.out.println(productManagement.searchId(id));
    }
}
