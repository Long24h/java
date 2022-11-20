package practice;

import java.util.ArrayList;

public class MissingNumber {
    public static void findMissing(int[] numbers) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int number : numbers) {
            list.add(number);
        }
        for (int i = 1; i <= 100; i++) {
            if (!list.contains(i)) {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        int[] num = {13, 93, 38 , 9, 73, 11, 28};
        findMissing(num);
    }
}
