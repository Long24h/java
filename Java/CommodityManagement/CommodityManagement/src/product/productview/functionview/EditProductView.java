package product.productview.functionview;

import product.productview.ProductTemplate;

public class EditProductView extends ProductTemplate {
    public EditProductView(){

    }
    @Override
    protected void showBody() {
        System.out.println("Enter product ID to edit:");
        int id = Integer.parseInt(scanner.nextLine());

        productManagement.editProduct(id);
    }
}
