package product.productview.functionview.allsortproductview;

import product.productview.ProductTemplate;
import product.productview.functionview.allsort.ComparatorByName;

import java.util.Collections;

public class SortProductByNameDesView extends ProductTemplate {
    public SortProductByNameDesView(){

    }
    @Override
    protected void showBody() {
        comparator = new ComparatorByName();
        Collections.sort(productManagement.getProductsList(), comparator);
        Collections.reverse(productManagement.getProductsList());
        showProduct(productManagement.getProductsList());
    }
}
