package product.productview.functionview;

import product.Product;
import product.productmanagement.ProductManagement;
import product.productview.ProductTemplate;

import java.util.Date;

public class EditProductView extends ProductTemplate {
    public EditProductView() {

    }

    @Override
    protected void showBody() {
        System.out.println("Enter product ID to edit:");
        int id = Integer.parseInt(scanner.nextLine());

        Product needEdit = ProductManagement.searchId(id);
        System.out.println(needEdit);

        boolean flag = true;
        do {
            menuEdit();

//            try {
                int choice = Integer.parseInt(scanner.nextLine());
                switch (choice) {
                    case 1:
                        System.out.println("Enter new product's name");
                        String name = scanner.nextLine();
                        needEdit.setName(name);
                        break;
                    case 2:
                        System.out.println("Enter new product's inventory:");
                        needEdit.setInventory(Double.parseDouble(scanner.nextLine()));
                        break;
                    case 3:
                        System.out.println("Enter new product's entry price:");
                        needEdit.setEntryPrice(Integer.parseInt(scanner.nextLine()));
                        break;
                    case 4:
                        System.out.println("Enter new product's unit:");
                        needEdit.setUnit(scanner.nextLine());
                        break;
                    case 5:
                        System.out.println("Enter new product's supplier:");
                        needEdit.setSupplier(scanner.nextLine());
                        break;
                    case 0:
                        System.out.println("Exit!");
                        flag = false;
                        break;
                    default:
                        System.out.println("Wrong input, enter again!");
                        flag = true;
                        break;
                }
//            }catch(Exception e){
//                System.err.println("Wrong input, try again!");
//                flag = true;
//            }
        }while(flag);

        showProduct(productManagement.getProductsList());
    }
    public void menuEdit(){
        System.out.println("What part of product do you want to edit?");
        System.out.println("1. Name:");
        System.out.println("2. Inventory:");
        System.out.println("3. Unit:");
        System.out.println("4. Entry price:");
        System.out.println("5. Supplier:");
    }
}
