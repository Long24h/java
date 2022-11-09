package product.productmanagement;

import product.Product;

import java.util.*;

public class ProductManagement {
    private static Scanner scanner = new Scanner(System.in);
    private static ArrayList<Product> productsList;

    public ProductManagement() {
    }

    public static void init() {
        productsList = new ArrayList<>();
        Date dateCreate = new Date();
        Date dateUpdate = new Date();

        productsList.add(new Product("Robusta", 64, "kg", 48000, "Trung Nguyen", dateCreate, dateUpdate));
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            e.getMessage();
        }
        productsList.add(new Product("Arabica", 19, "kg", 56000, "Nestle", dateCreate, dateUpdate));
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            e.getMessage();
        }
        productsList.add(new Product("Moka", 94, "kg", 47000, "Dalat", dateCreate, dateUpdate));
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            e.getMessage();
        }
        productsList.add(new Product("Orange", 7, "kg", 16000, "Ha Giang", dateCreate, dateUpdate));
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            e.getMessage();
        }
        productsList.add(new Product("Milk", 16, "can", 9000, "VinaMilk", dateCreate, dateUpdate));

    }

    static {
        productsList = new ArrayList<>();
        Date dateCreate = new Date();
        Date dateUpdate = new Date();

        productsList.add(new Product("Robusta", 64, "kg", 48000, "Trung Nguyen", dateCreate, dateUpdate));
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            e.getMessage();
        }
        productsList.add(new Product("Arabica", 19, "kg", 56000, "Nestle", dateCreate, dateUpdate));
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            e.getMessage();
        }
        productsList.add(new Product("Moka", 94, "kg", 47000, "Dalat", dateCreate, dateUpdate));
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            e.getMessage();
        }
        productsList.add(new Product("Orange", 7, "kg", 16000, "Ha Giang", dateCreate, dateUpdate));
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            e.getMessage();
        }
        productsList.add(new Product("Milk", 16, "can", 9000, "VinaMilk", dateCreate, dateUpdate));
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            e.getMessage();
        }
        productsList.add(new Product("Moka", 64, "can", 56000, "Trung Nguyen", dateCreate, dateUpdate));
    }

    public static ArrayList<Product> getProductsList() {
        return productsList;
    }

    public static void setProductsList(ArrayList<Product> productsList) {
        ProductManagement.productsList = productsList;
    }

    public static void removeProduct(int id) {
        for (int i = 0; i < productsList.size(); i++) {
            if (productsList.get(i).getId() == id) {
                productsList.remove(i);
                break;
            }
        }
    }

    public void sortProduct(Comparator<Product> comparator) {
        productsList.sort(comparator);
    }

    public static void addProduct(Product product) {
        productsList.add(product);
    }


    public static Product searchId(int id) {
        Product temp = new Product();
        int count = 0;
        for (int i = 0; i < getProductsList().size(); i++) {
            if (getProductsList().get(i).getId() == id) {
                temp = getProductsList().get(i);
                count++;
                break;
            } else if (count == 0 && i == getProductsList().size() - 1){
                temp = null;
            }
        }
        return temp;
    }


    public static List<Product> searchName(String name) {
        List<Product> sameName = new ArrayList<>();
        int count = 0;
        for (int i = 0; i < productsList.size(); i++) {
            if (productsList.get(i).getName().toUpperCase().contains(name.toUpperCase())) {
                sameName.add(productsList.get(i));
                count++;
            } else if (count == 0 && i == productsList.size() - 1) {
                sameName = null;
            }
        }
        return sameName;
    }

    public static List<Product> searchInventory(int inventory) {
        List<Product> sameInventory = new ArrayList<>();
        int count = 0;
        for (int i = 0; i < productsList.size(); i++) {
            if (productsList.get(i).getInventory() == inventory) {
                sameInventory.add(productsList.get(i));
                count++;
            } else if (count == 0 && i == productsList.size() - 1) {
                sameInventory = null;
            }
        }
        return sameInventory;
    }


    public static List<Product> searchEntryPrice(int entryPrice) {
        List<Product> sameEntryPrice = new ArrayList<>();
        int count = 0;

        for (int i = 0; i < productsList.size(); i++) {
            if (productsList.get(i).getEntryPrice() == entryPrice) {
                sameEntryPrice.add(productsList.get(i));
                count++;
            } else if (count == 0 && i == productsList.size() - 1) {
                sameEntryPrice = null;
            }
        }
        return sameEntryPrice;
    }


    public static List<Product> searchUnit(String unit) {
        List<Product> sameUnit = new ArrayList<>();
        int count = 0;

        for (int i = 0; i < productsList.size(); i++) {
            if (productsList.get(i).getUnit().toUpperCase().contains(unit.toUpperCase())) {
                sameUnit.add(productsList.get(i));
                count++;
            } else if (count == 0 && i == productsList.size() - 1) {
                sameUnit = null;
            }
        }
        return sameUnit;
    }


    public static List<Product> searchSupplier(String supplier) {
        List<Product> sameSupplier = new ArrayList<>();
        for (Product product : productsList) {
            if (product.getSupplier().toUpperCase().contains(supplier.toUpperCase())) {
                sameSupplier.add(product);
            }
        }
        return sameSupplier;
    }

}
