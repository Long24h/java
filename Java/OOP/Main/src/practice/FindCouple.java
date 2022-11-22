package practice;

public class FindCouple {
    public static void findNumber(int[] numbers, int sum) {
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] + numbers[j] == sum) {
                    System.out.println(numbers[i] + " + " + numbers[j] + " = " + sum);
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 9, 8, 6};
        findNumber(numbers, 10);
    }
}
