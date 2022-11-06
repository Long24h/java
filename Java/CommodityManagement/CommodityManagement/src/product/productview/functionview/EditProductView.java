package product.productview.functionview;

import product.productmanagement.ProductManagement;
import product.productview.ProductTemplate;

public class EditProductView extends ProductTemplate {
    public EditProductView(){

    }
    @Override
    protected void showBody() {
        System.out.println("Enter product ID to edit:");
        int id = Integer.parseInt(scanner.nextLine());

        ProductManagement.editProduct(id);
        showProduct(productManagement.getProductsList());
    }
}
