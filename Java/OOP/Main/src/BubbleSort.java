import java.util.Scanner;
public class BubbleSort {
    private static Scanner scanner = new Scanner(System.in);
    private int[] arr = new int[100];

    public BubbleSort() {
        makeRandomArr();
    }
    public int[] makeRandomArr() {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Main.randomInt();
        }
        return arr;
    }

    public int[] getArr() {
        return arr;
    }

    public void setArr(int[] arr) {
        this.arr = arr;
    }
    public void searchByIndex(){
        System.out.println("Nhập chỉ số cần tìm trong mảng:");
        int index = Integer.parseInt(scanner.nextLine());
        try {
            System.out.println("Số có chỉ số " + index + " là: " + arr[index]);
        } catch (IndexOutOfBoundsException e){
//            e.printStackTrace();
            System.err.println("Giá trị vượt độ dài của mảng!");
        }
    }

    public void sortByBubble() {
        for (int i = 0; i < arr.length - 1; i++) {
            boolean flag = false;
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    flag = true;
                }
            }
            if ( flag == false){
                break;
            }
        }
    }

    public static void bubbleSortByStep(int[] arr) {
        boolean needNextPass = true;
        for (int k = 1; k < arr.length && needNextPass; k++) {
            needNextPass = false;
            for (int i = 0; i < arr.length - k; i++) {
                if (arr[i] > arr[i + 1]) {
                    System.out.println("Swap " + arr[i] + " with " + arr[i + 1]);
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    needNextPass = true;
                }
            }
            if (needNextPass == false) {
                System.out.println("Array may be sorted and next pass not needed");
                break;
            }
            System.out.print("List after the  " + k + "' sort: ");
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[j] + "\t");
            }
            System.out.println();
        }
    }
    public void selectionSort(){
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }

            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }
    public void interchangeSort(){
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 1 + i; j < arr.length; j++) {
                if (arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
    public void interchangeSortDemo(){
        for (int i = 0; i < arr.length - 1; i++) {
            System.out.println("i = " + i);
            for (int j = i + 1; j < arr.length; j++) {
                System.out.println("j = " + j);
                if (arr[i] > arr[j]){
                    System.out.println("Swap " + arr[i] + " with " + arr[j]);
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
    public void insertionSort(){
        for (int i = 1; i < arr.length; ++i) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }

    @Override
    public String toString() {
        String str = "";
        for (int item : arr) {
            str += item + " ";
        }
        return str;
    }
}
