import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class ProductManage {
    public static Scanner scanner = new Scanner(System.in);
    private static List<Product> productList = new ArrayList<>();

    public ProductManage() {
//        init();
    }

//    public void init() {
//        productList.add(new Product("wgne", 25295));
//        productList.add(new Product("ghm34", 74533));
//        productList.add(new Product("berm", 947363));
//        productList.add(new Product("bwrob", 962748));
//        productList.add(new Product("e0herk", 236734));
//    }
//
    static {
        productList.add(new Product("wgne", 25295));
        productList.add(new Product("bwrob", 74533));
        productList.add(new Product("berm", 947363));
        productList.add(new Product("bwrob", 962748));
        productList.add(new Product("e0herk", 236734));
    }

    public static List<Product> getProductList() {
        return productList;
    }

    public static void setProductList(List<Product> productList) {
        ProductManage.productList = productList;
    }

    public static void addE(Product product) {
        productList.add(product);
    }

    public static Product removeId(int id) {
        Product product1 = new Product();
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).getId() == id) {
                product1 = productList.remove(i);
                break;
            }
        }
        return product1;
    }

    public static void fixElement(int id) {
        for (Product product : productList) {
            if (product.getId() == id) {
                System.out.println("Enter new name:");
                product.setName(scanner.nextLine());
                System.out.println("Enter new price:");
                product.setPrice(Long.parseLong(scanner.nextLine()));
            }
        }
    }

    public static Product search(int id) {
        Product temp = new Product();
        for (Product product : productList) {
            if (product.getId() == id){
                temp = product;
                break;
            } else {
                temp = null;
            }
        }
        return temp;
    }
    public static ArrayList<Product> search(String name) {
        ArrayList<Product> sameName = new ArrayList<>();
        for (Product product : productList) {
            if (product.getName() == name){
                sameName.add(product);
            }
        }
        return sameName;
    }

    public static void sort(Comparator<Product> comparator) {
        productList.sort(comparator);
    }

    @Override
    public String toString() {
        String str = "";
        for (Product product : productList){
            str += product;
        }
        return str;
    }
}
