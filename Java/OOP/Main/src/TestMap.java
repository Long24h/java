import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TestMap {
    public static void main(String[] args) {
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Binz", 29);
        hashMap.put("Karik", 35);
        hashMap.put("Chicken", 19);
        hashMap.put("Duck", 87);
        hashMap.put("Craft", 53);
        System.out.println("Display entries in HashMap:");
        System.out.println(hashMap + "\n");

        Map<String, Integer> treeMap = new TreeMap<>(hashMap);
        System.out.println("Display entries in ascending order of key: ");
        System.out.println(treeMap);

        Map<String, Integer> linkedHashMap = new LinkedHashMap<>(16, 0.75f, true);
        linkedHashMap.put("Binz", 29);
        linkedHashMap.put("Karik", 35);
        linkedHashMap.put("Chicken", 19);
        linkedHashMap.put("Duck", 87);
        linkedHashMap.put("Craft", 53);
        System.out.println("\nThe age for Duck is " + linkedHashMap.get("Duck"));
    }
}
