package product.productview.functionview;

import product.Product;
import product.productview.ProductTemplate;

import java.util.Date;

public class AddProductView extends ProductTemplate {
    public AddProductView(){

    }
    @Override
    protected void showBody() {

        System.out.println("Add new product:");
        System.out.println("----------------");
        System.out.println("Enter new product's name:");
        String name = scanner.nextLine();

        System.out.println("Enter new product's inventory:");
        float inventory = Float.parseFloat(scanner.nextLine());

        System.out.println("Enter new product's unit:");
        String unit = scanner.nextLine();

        System.out.println("Enter new product's entry price:");
        int entryPrice = Integer.parseInt(scanner.nextLine());

        System.out.println("Enter new product's supplier:");
        String supplier = scanner.nextLine();

        Date dateCreate = new Date();
        Date dateUpdate = new Date();

        Product newProduct = new Product(name, inventory, unit, entryPrice, supplier, dateCreate, dateUpdate);
        productManagement.addProduct(newProduct);

        showProduct(productManagement.getProductsList());
    }
}
