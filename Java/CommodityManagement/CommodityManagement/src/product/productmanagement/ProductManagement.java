package product.productmanagement;

import product.Product;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class ProductManagement {
    private Scanner scanner = new Scanner(System.in);
    private static ArrayList<Product> productsList = new ArrayList<>();
    public ProductManagement(){

    }
    static {
        Date dateCreate = new Date();
        Date dateUpdate = new Date();
        productsList.add(new Product("Robusta", 64, "kg", 48000, "Trung Nguyen", dateCreate, dateUpdate));
        productsList.add(new Product("Arabica", 19, "kg", 56000, "Nestle", dateCreate, dateUpdate));
        productsList.add(new Product("Moka", 94, "kg", 47000, "Dalat", dateCreate, dateUpdate));
        productsList.add(new Product("Orange", 7, "kg", 16000, "Ha Giang", dateCreate, dateUpdate));
        productsList.add(new Product("Milk", 16, "can", 9000, "VinaMilk", dateCreate, dateUpdate));
    }

    public static ArrayList<Product> getProductsList() {
        return productsList;
    }

    public static void setProductsList(ArrayList<Product> productsList) {
        ProductManagement.productsList = productsList;
    }
    public void addProduct(Product product){
        productsList.add(product);
    }
    public void removeProduct(int id){
        for (int i = 0; i < productsList.size(); i++) {
            if (productsList.get(i).getId() == id){
                productsList.remove(i);
                break;
            }
        }
    }
    public Product searchProductById(int id){
        Product temp = new Product();
        for (Product product : productsList) {
            if (product.getId() == id){
                temp = product;
                break;
            }
        }
        return temp;
    }
    public ArrayList<Product> searchProductByName(String name){
        ArrayList<Product> sameName = new ArrayList<>();
        for (Product product : productsList) {
            if (product.getName().toUpperCase().equals(name.toUpperCase())){
                sameName.add(product);
            }
        }
        return sameName;
    }
    public ArrayList<Product> searchProductByEntryPrice(int EntryPrice){
        ArrayList<Product> sameEntryPrice = new ArrayList<>();
        for (Product product : productsList) {
            if (product.getEntryPrice() == EntryPrice){
                sameEntryPrice.add(product);
            }
        }
        return sameEntryPrice;
    }
    public ArrayList<Product> searchProductByInventory(float inventory){
        ArrayList<Product> sameInventory = new ArrayList<>();
        for (Product product : productsList) {
            if (product.getInventory() == inventory){
                sameInventory.add(product);
            }
        }
        return sameInventory;
    }
    public ArrayList<Product> searchProductByUnit(String unit){
        ArrayList<Product> sameUnit = new ArrayList<>();
        for (Product product : productsList) {
            if (product.getUnit().toUpperCase().equals(unit.toUpperCase())){
                sameUnit.add(product);
            }
        }
        return sameUnit;
    }
    public ArrayList<Product> searchProductBySupplier(String supplier){
        ArrayList<Product> sameSupplier = new ArrayList<>();
        for (Product product : productsList) {
            if (product.getSupplier().toUpperCase().equals(supplier.toUpperCase())){
                sameSupplier.add(product);
            }
        }
        return sameSupplier;
    }
    public void setProduct(int id){
        for (int i = 0; i < productsList.size(); i++) {
            if (productsList.get(i).getId() == id){
                System.out.println("Set this product:");
                System.out.println("Enter new product's name:");
                productsList.get(i).setName(scanner.nextLine());

                System.out.println("Enter new product's inventory:");
                productsList.get(i).setInventory(Float.parseFloat(scanner.nextLine()));

                System.out.println("Enter new product's entry price:");
                productsList.get(i).setEntryPrice(Integer.parseInt(scanner.nextLine()));

                System.out.println("Enter new product's unit:");
                productsList.get(i).setUnit(scanner.nextLine());

                System.out.println("Enter new product's supplier:");
                productsList.get(i).setSupplier(scanner.nextLine());

                productsList.get(i).setDateUpdate(new Date());
            }
        }
    }
}
