package practice;

public class FirstOdd {
    public static void printArray(int[] arr) {
        for (int item : arr) {
            System.out.print(item + " ");
        }
        System.out.println();
    }

    public static int[] findFirstOddNumbers(int[] numbers) {
        int[] newNumbers = new int[numbers.length];
        int index = 0;
        for (int item : numbers) {
            String str = Integer.toString(item);
            String c = String.valueOf(str.charAt(0));
            int n = Integer.parseInt(c);
            if (n % 2 == 1) {
                newNumbers[index] = item;
                index++;
            }
        }
        int[] result = new int[index];
        System.arraycopy(newNumbers, 0, result, 0, result.length);
        return result;
    }

    public static void main(String[] args) {
        int[] arr1 = {22, 113, 26, 583, 433, 9034, 7, 130, 36};

        int[] arr2 = findFirstOddNumbers(arr1);
        printArray(arr2);
    }
}
