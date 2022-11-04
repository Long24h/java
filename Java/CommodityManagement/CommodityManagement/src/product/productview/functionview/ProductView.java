package product.productview.functionview;

import product.productview.ProductTemplate;

public class ProductView extends ProductTemplate {
    public ProductView(){

    }
    @Override
    protected void showBody() {
        showProduct(productManagement.getProductsList());
    }
}
