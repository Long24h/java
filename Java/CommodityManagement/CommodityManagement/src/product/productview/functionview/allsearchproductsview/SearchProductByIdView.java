package product.productview.functionview.allsearchproductsview;

import product.productmanagement.ProductManagement;
import product.productview.ProductTemplate;


public class SearchProductByIdView extends ProductTemplate {
    public SearchProductByIdView(){

    }
    @Override
    protected void showBody() {


        System.out.println("Enter product's ID to search:");
        int id = Integer.parseInt(scanner.nextLine());

        System.out.println(ProductManagement.searchId(id));


    }
}
