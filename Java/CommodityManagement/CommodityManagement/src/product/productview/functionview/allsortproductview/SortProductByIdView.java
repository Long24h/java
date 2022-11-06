package product.productview.functionview.allsortproductview;

import product.Product;
import product.productview.ProductTemplate;
import product.productview.functionview.allsort.ComparatorById;

import java.util.Comparator;

public class SortProductByIdView extends ProductTemplate {
    public SortProductByIdView(){
        showBody();
    }
    @Override
    protected void showBody() {
        comparator = new ComparatorById();
        productManagement.sortProduct(comparator);
        showProduct(productManagement.getProductsList());
    }
}
