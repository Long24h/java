package product.productview.functionview.allsortproductview;

import product.productview.ProductTemplate;
import product.productview.functionview.allsort.ComparatorByName;

public class SortProductByNameView extends ProductTemplate {
    public SortProductByNameView(){
        showBody();
    }
    @Override
    protected void showBody() {
        comparator = new ComparatorByName();
        productManagement.sortProduct(comparator);
        showProduct(productManagement.getProductsList());
    }
}
