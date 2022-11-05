package product.productmanagement;

import iterfaces.product.ProductSearchable;
import iterfaces.product.ProductSortable;
import product.Product;

import java.util.*;

public class ProductManagement implements ProductSortable, ProductSearchable {
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

    public void editProduct(int id){
        for (int i = 0; i < productsList.size(); i++) {
            if (productsList.get(i).getId() == id){
                System.out.println("edit this product:");
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
    public void sortProduct(Comparator<Product> comparator){
        productsList.sort(comparator);
    }

    @Override
    public Product searchId(int id) {
        Product temp = new Product();
        for (Product product : productsList) {
            if (product.getId() == id){
                temp = product;
                break;
            }
        }
        return temp;
    }

    @Override
    public List<Product> searchName(String name) {
        List<Product> sameName = new ArrayList<>();
        for (Product product : productsList) {
            if (product.getName().toUpperCase().equals(name.toUpperCase())){
                sameName.add(product);
            }
        }
        return sameName;
    }


    @Override
    public List<Product> searchInventory(int inventory) {
        List<Product> sameInventory = new ArrayList<>();
        for (Product product : productsList) {
            if (product.getInventory() == inventory){
                sameInventory.add(product);
            }
        }
        return sameInventory;
    }

    @Override
    public List<Product> searchEntryPrice(int entryPrice) {
        List<Product> sameEntryPrice = new ArrayList<>();
        for (Product product : productsList) {
            if (product.getEntryPrice() == entryPrice){
                sameEntryPrice.add(product);
            }
        }
        return sameEntryPrice;
    }

    @Override
    public List<Product> searchUnit(String unit) {
        List<Product> sameUnit = new ArrayList<>();
        for (Product product : productsList) {
            if (product.getUnit().toUpperCase().equals(unit.toUpperCase())){
                sameUnit.add(product);
            }
        }
        return sameUnit;
    }

    @Override
    public List<Product> searchSupplier(String supplier) {
        List<Product> sameSupplier = new ArrayList<>();
        for (Product product : productsList) {
            if (product.getSupplier().toUpperCase().equals(supplier.toUpperCase())){
                sameSupplier.add(product);
            }
        }
        return sameSupplier;
    }

    @Override
    public void sortInventory(String inventory) {

    }

    @Override
    public void sortUnit(String unit) {

    }

    @Override
    public void sortEntryPrice(int entryPrice) {

    }

    @Override
    public void sortSupplier(String supplier) {

    }

    @Override
    public void sortId(int id) {

    }

    @Override
    public void sortName(String name) {

    }
}
