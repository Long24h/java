import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ProductManageLinkedList {
    private static List<Product> productLinkedList = new LinkedList<>();
    public ProductManageLinkedList(){}
    static {
        productLinkedList.add(new Product("grei23", 2378));
        productLinkedList.add(new Product("iwcqwo", 374313));
        productLinkedList.add(new Product("miopwb", 926059));
    }
    public static void addItem(Product product){
        productLinkedList.add(product);
    }
    public static void addItem(int index, Product product){
        productLinkedList.add(index, product);
    }
    public static void removeItem(int index){
        productLinkedList.remove(index);
    }
    public static Product searchItem(int id){
        Product temp = new Product();
        for (Product product : productLinkedList) {
            if (product.getId() == id){
                temp = product;
                break;
            }
        }
        return temp;
    }
    public static LinkedList searchItem(String name){
        LinkedList<Product> sameName = new LinkedList<>();
        for (Product pr : productLinkedList) {
            if (pr.getName().equals(name)){
                sameName.add(pr);
            }
        }
        return sameName;
    }
    public static void showItem(){
        Iterator<Product> iterator = productLinkedList.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next() + " ");
        }
    }
}
