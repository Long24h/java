package product.productview.functionview.allsearchproductsview;

import product.Product;
import product.productmanagement.ProductManagement;
import product.productview.ProductTemplate;

public class SearchProductByIdView extends ProductTemplate {
    public SearchProductByIdView(){
        showBody();
    }
    @Override
    protected void showBody() {
        System.out.println("Enter product's ID to search:");
        int id = Integer.parseInt(scanner.nextLine());

        System.out.println(productManagement.searchId(id));


//        for (int i = 0; i < productManagement.getProductsList().size(); i++) {
//            if (productManagement.getProductsList().get(i).getId() == id) {
//                System.out.println(productManagement.getProductsList().get(i));
//                break;
//            }
//
//        }
    }
}
