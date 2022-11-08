package product.productview.functionview.allsortproductview;

import product.productview.ProductTemplate;
import product.productview.functionview.allsort.ComparatorByName;

public class SortProductByNameAscView extends ProductTemplate {
    public SortProductByNameAscView(){

    }
    @Override
    protected void showBody() {
        comparator = new ComparatorByName();
        productManagement.sortProduct(comparator);
        showProduct(productManagement.getProductsList());
    }
}
