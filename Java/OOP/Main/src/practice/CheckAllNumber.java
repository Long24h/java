package practice;

public class CheckAllNumber {
    public static boolean checkNumber(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            try {
                if (Integer.parseInt(String.valueOf(str.charAt(i))) < 10) {
                    count++;
                }
            } catch (NumberFormatException n) {
                n.getMessage();
            }
        }
        return count == str.length();
    }

    public static void main(String[] args) {
        System.out.println(checkNumber("001k5"));
    }
}
