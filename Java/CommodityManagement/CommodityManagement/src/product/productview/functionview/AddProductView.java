package product.productview.functionview;

import product.Product;
import product.productmanagement.ProductManagement;
import product.productview.ProductTemplate;

import java.util.Date;

public class AddProductView extends ProductTemplate {
    public AddProductView() {
    }

    @Override
    protected void showBody() {
        float inventory = 0;

            System.out.println("Add new product:");
            System.out.println("----------------");
            System.out.println("Enter new product's name:");
            String name = scanner.nextLine();

                try{
                    System.out.println("Enter new product's inventory:");
                    inventory = Float.parseFloat(scanner.nextLine());
                }catch(NumberFormatException numberFormatException){
                    System.err.println("You must enter a whole number!");
                }

            System.out.println("Enter new product's unit:");
            String unit = scanner.nextLine();

            System.out.println("Enter new product's entry price:");
            int entryPrice = Integer.parseInt(scanner.nextLine());

            System.out.println("Enter new product's supplier:");
            String supplier = scanner.nextLine();

            Date dateCreate = new Date();
            Date dateUpdate = new Date();

            Product newProduct = new Product(name, inventory, unit, entryPrice, supplier, dateCreate, dateUpdate);
            ProductManagement.addProduct(newProduct);

            showProduct(productManagement.getProductsList());
         }
}
