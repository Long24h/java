package practice;

public class DuplicateWord {
    public static void printDuplicate(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length() - 1; i++) {
            for (int j = i + 1; j < str.length(); j++) {
                if (String.valueOf(str.charAt(i)).equals(String.valueOf(str.charAt(j)))) {
                    sb.append(str.charAt(i));
                }
            }
        }
        for (int i = 0; i < sb.length() - 1; i++) {
            for (int j = i + 1; j < sb.length(); j++) {
                if (sb.charAt(i) == sb.charAt(j)) {
                    sb.deleteCharAt(j);
                    j--;
                }
            }
        }
        System.out.println(sb);
    }

    public static void main(String[] args) {
        printDuplicate("brem isese fwneog ihew bner");
    }
}
