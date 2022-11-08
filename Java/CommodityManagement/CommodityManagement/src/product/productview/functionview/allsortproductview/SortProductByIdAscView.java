package product.productview.functionview.allsortproductview;

import product.productview.ProductTemplate;
import product.productview.functionview.allsort.ComparatorById;

import java.util.Collections;

public class SortProductByIdAscView extends ProductTemplate {
    public SortProductByIdAscView(){

    }
    @Override
    protected void showBody() {
        comparator = new ComparatorById();
        Collections.sort(productManagement.getProductsList(), comparator);
        showProduct(productManagement.getProductsList());
    }
}
