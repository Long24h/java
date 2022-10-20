import java.util.Scanner;

public class StopWatch {
    public static Scanner scanner = new Scanner(System.in);
    private long startTime, endTime;

    public StopWatch() {

    }
    public StopWatch(long startTime, long endTime) {
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public long getStartTime() {
        return startTime;
    }

    public long getEndTime() {
        return endTime;
    }

    public long startTime() {
        return this.startTime = System.currentTimeMillis();
    }

    public long endTime() {
        return this.endTime = System.currentTimeMillis();
    }

    public void setEndTime(long endTime) {
        this.endTime = endTime;
    }

    public void setStartTime(long startTime) {
        this.startTime = startTime;
    }

    public long getElapsedTime() {
        return this.endTime - this.startTime;
    }
    public void runStopWatch(){
        this.startTime();
        int[] arr = makeArr();
        sort(arr);
        showArr(arr);
        this.endTime();
        System.out.printf("Sap xep lai mang mat %d giay", this.getElapsedTime());
    }

    public static int[] sort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }

        }
        return arr;
    }

    public static void showArr(int[] arr) {
        for (int a : arr) {
            System.out.print(a + " ");
        }
        System.out.println();
    }

    public static int[] makeArr() {
        System.out.println("Nhập chiều dài mảng");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 101);
        }
        return arr;
    }


    public static void main(String[] args) {
//        int[] arr = makeArr();
//        showArr(arr);
//        sort(arr);
//        showArr(arr);

    }
}
