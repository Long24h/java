import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Hello world from MT!");
        int[] arr = createArray();
//        showArray(arr);

//        int[] emptyArr = createEmptyArray();
        showArray(arr);
        int[] arr1 = insertNumber(arr);
        showArray(arr1);



    }
    public static int[] insertNumber(int[] arr){
        System.out.println("Nhập giá trị bạn muốn chèn vào:");
        int number = scanner.nextInt();
        System.out.println("Nhập vị trí bạn cần chèn:");
        int index = scanner.nextInt();
        int [] newArray = Arrays.copyOf(arr, arr.length+1);
        for (int i = index; i < newArray.length; i++) {
            if (i == index) {
                newArray[i] = number;
            } else {
                newArray[i] = arr[i-1];
            }
        }
        return newArray;
    }
    public static int[] deleteElement(int[] arr, int num){
        while (findExistElementLastIndex(arr, 5) != -1){
            deleteLastIndexElement( arr, 5);
        }
        return arr;
    }
    public static int[] deleteLastIndexElement(int[] arr, int num){
        for (int i = findExistElementLastIndex(arr, num); i < arr.length-1; i++) {
            int temp = arr[i];
            arr[i] = arr[i+1];
            arr[i+1] = temp;
        }
        arr[arr.length-1] = 0;
        return arr;
    }

    public static int findMin(int[] arr) {
        int min = arr[0];
        for (int n : arr) {
            if (n < min) {
                min = n;
            }
        }
        return min;
    }

    public static int findMax(int[] arr) {
        int max = arr[0];
        for (int n : arr) {
            if (n > max) {
                max = n;
            }
        }
        return max;
    }
    public static int findExistElementLastIndex(int[] arr, int num) {
        int index = -1;
        if (checkExistElement(arr, num)) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == num) {
                    index = i;
                }
            }
        }
        return index;
    }

    public static void showExistElementIndex(int[] arr, int num) {
        if (checkExistElement(arr, num)) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == num) {
                    System.out.println("Số " + num + " nằm ở index: " + i);

                }
            }
        } else {
            System.out.printf("Số %d không tồn tại trong mảng!", num);
        }
    }

    public static boolean checkExistElement(int[] arr, int num) {
        boolean flag = true;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                count++;
                flag = true;
            } else if (i == arr.length - 1 && count == 0) {
                flag = false;
            }
        }
        return flag;
    }

    public static void showReverseArray(int[] arr) {
        reverseArray(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void reverseArray(int[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
    }

    public static void showArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static int[] createArray() {
        System.out.println("Nhập chiều dài mảng bạn muốn tạo!");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        int max = 5, min = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * (max - min + 1));
        }
        return arr;
    }
    public static int[] createEmptyArray() {
        System.out.println("Nhập chiều dài mảng bạn muốn tạo!");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        return arr;
    }
}