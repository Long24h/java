package product.productview.functionview.allsortproductview;

import product.productview.ProductTemplate;
import product.productview.functionview.allsort.ComparatorByDateCreate;

public class SortByDateCreateAscView extends ProductTemplate {
    public SortByDateCreateAscView(){

    }
    @Override
    protected void showBody() {
        comparator = new ComparatorByDateCreate();
        productManagement.getProductsList().sort(comparator);
        showProduct(productManagement.getProductsList());
    }
}
