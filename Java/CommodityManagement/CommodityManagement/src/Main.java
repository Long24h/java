import product.Product;
import product.productmanagement.ProductManagement;
import product.productview.functionview.AddProductView;
import product.productview.functionview.ProductView;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
//        tao vong lap set product

        Date dateCreate = new Date();
        Date dateUpdate = new Date();

        ProductManagement productManagement = new ProductManagement();
        productManagement.addProduct(new Product("greiun", 364, "hh", 375, "nohn", dateCreate, dateUpdate));
        System.out.println(productManagement.searchId(3));
        System.out.println(productManagement.searchName("Orange"));
        System.out.println(productManagement.searchEntryPrice(9000));
        System.out.println(productManagement.searchInventory(16));
        System.out.println(productManagement.searchUnit("kg"));
        System.out.println(productManagement.searchSupplier("Dalat"));

        productManagement.removeProduct(2);

        ProductView productView = new ProductView();

        AddProductView addProductView = new AddProductView();

//        addProductView();
        productView.showProduct(productManagement.getProductsList());
    }
}