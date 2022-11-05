package product.productview.functionview;

import product.productmanagement.ProductManagement;
import product.productview.ProductTemplate;

public class RemoveProductView extends ProductTemplate {
    public RemoveProductView(){

    }
    @Override
    protected void showBody() {
        System.out.println("Please enter product's id to remove:");
        int id = Integer.parseInt(scanner.nextLine());

        productManagement.removeProduct(id);

        showProduct(productManagement.getProductsList());
    }
}
