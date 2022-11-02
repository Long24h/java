import java.util.TreeMap;

public class CountWordByMap {
    
    public static void countWord(String str){
        TreeMap<Character, Integer> treeMap = new TreeMap<>();
        for (int i = 0; i < str.length(); i++) {

            int count = 1;
            if (!treeMap.containsKey(str.charAt(i))){
                treeMap.put(str.toUpperCase().charAt(i), 1);
            } else {
                treeMap.put(str.toUpperCase().charAt(i), ++count);
            }
        }
        System.out.println(treeMap);
    }
}
