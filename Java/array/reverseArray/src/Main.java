import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Hello world from MT!");
        int[] arr = createArray();
        showArray(arr);


        System.out.println(findMax(arr));


    }


    public static int findMax(int[] arr){
        int max = arr[0];
        for (int n : arr){
            if (n > max){
                max = n;
            }
        }
        return max;
    }

    public static void showExistValueIndex(int[] arr, int num) {
        if (checkExistValue(arr, num)) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == num) {
                    System.out.println("Số " + num + " nằm ở index: " + i);

                }
            }
        } else {
            System.out.printf("Số %d không tồn tại trong mảng!", num);
        }
    }

    public static boolean checkExistValue(int[] arr, int num) {
        boolean flag = true;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                count++;
                flag = true;
            } else if (i == arr.length-1 && count == 0) {
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
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 101);
        }
        return arr;
    }
}