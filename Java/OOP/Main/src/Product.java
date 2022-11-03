import java.util.ArrayList;
import java.util.List;

public class Product {
    private int id;
    private String name;
    private long price;
    private static int count = 1;
    public Product(){
    }
    public Product(String name, long price){
        this.id = count++;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "id: " + id + ", name: " + name + ", price: " + price + "\n";
    }
}
