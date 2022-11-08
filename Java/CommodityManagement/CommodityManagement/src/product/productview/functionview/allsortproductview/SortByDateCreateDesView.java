package product.productview.functionview.allsortproductview;

import product.productview.ProductTemplate;
import product.productview.functionview.allsort.ComparatorByDateCreate;

import java.util.Collections;

public class SortByDateCreateDesView extends ProductTemplate {
    public SortByDateCreateDesView(){

    }
    @Override
    protected void showBody() {
        comparator = new ComparatorByDateCreate();
        productManagement.getProductsList().sort(comparator);
        Collections.reverse(productManagement.getProductsList());
        showProduct(productManagement.getProductsList());
    }
}
