package product.productview.functionview.allsortproductview;

import product.Product;
import product.productview.ProductTemplate;
import product.productview.functionview.allsort.ComparatorById;

import java.util.Collections;
import java.util.List;

public class SortProductByIdDesView extends ProductTemplate {
    public SortProductByIdDesView(){

    }
    @Override
    protected void showBody() {
        comparator = new ComparatorById();
        Collections.sort(productManagement.getProductsList(), comparator);
        Collections.reverse(productManagement.getProductsList());
        showProduct(productManagement.getProductsList());
    }
}
