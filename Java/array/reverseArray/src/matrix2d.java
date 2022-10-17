import java.util.Scanner;

public class matrix2d {
    public static Scanner scanner = new Scanner((System.in));

    public static void main(String[] args) {
        int[][] arr = createArray();
        printArray(arr);
        showSumEven(arr);
        showSumDiagonal(arr);
        showLeftTriangle(arr);
        showRightTriangle(arr);
        showSumRightTriangel(arr);
        showLeftInvertedTriangle(arr);
        showSumLeftInvertedTriangle(arr);
        showBorder(arr);

    }
    public static void showBorder(int[][] arr){
        System.out.println("Các số nằm trên đường viền của ma trận: \n" + makeBorder(arr));
    }
    public static String makeBorder(int[][] arr){
        String borderSquare = "";
        for (int i = 0; i < arr.length; i++) {
            String row = "[";
            for (int j = 0; j < arr[i].length; j++) {
                if (i==0 || i == arr.length-1){
                    if (j == arr.length-1) {
                        row += arr[i][j] + "]" + "\n";
                    }else {
                        row += arr[i][j] + ",";
                    }
                } else if (j==0){
                    row += arr[i][j] + "]";
                } else if (j==arr[i].length-1){
                    row += "[" + arr[i][j] + "]" + "\n";
                }
            }
            borderSquare += row;
        }
        return borderSquare;
    }
    public static void showSumLeftInvertedTriangle(int[][] arr){
        System.out.println("Tổng các số chẵn của tam giác trái ngược: " + getSumEvenLeftInvertedTriangle(arr));
    }
    public static int getSumEvenLeftInvertedTriangle(int[][] arr){
        int sumEven = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length - i; j++) {
                if (j <= arr[i].length - i - 1 && arr[i][j]%2==0) {
                    sumEven += arr[i][j];
                }
            }
        }
        return sumEven;
    }

    public static void showLeftInvertedTriangle(int[][] arr) {
        String triangle = "";
        for (int i = 0; i < arr.length; i++) {
            String row = "[";
            for (int j = 0; j < arr[i].length - i; j++) {
                if (j == arr[i].length - i - 1) {
                    row += arr[i][j] + "]" + "\n";
                } else {
                    row += arr[i][j] + ",";
                }
            }
            triangle += row;
        }
        System.out.println("Hình tam giác ngược bên trái: \n" + triangle);
    }

    public static void showSumRightTriangel(int[][] arr) {
        System.out.println("Tổng các số trong tam giác bên phải: " + getSumRightTriangle(arr));
    }

    public static int getSumRightTriangle(int[][] arr) {
        int sumRightTriangle = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (j >= i) {
                    sumRightTriangle += arr[i][j];
                }
            }
        }
        return sumRightTriangle;
    }

    public static void showRightTriangle(int[][] arr) {
        String triangle = "";
        for (int i = 0; i < arr.length; i++) {
            String row = "[";
            for (int j = 0; j < arr[i].length; j++) {
                if (j == arr[i].length - 1) {
                    row += arr[i][j] + "]" + "\n";
                } else if (j >= i) {
                    row += arr[i][j] + ",";
                }
            }
            triangle += row;
        }
        System.out.println("Tam giác bên phải: \n" + triangle);
    }

    public static void showLeftTriangle(int[][] arr) {
        String triangle = "";
        for (int i = 0; i < arr.length; i++) {
            String row = "[";
            for (int j = 0; j < arr[i].length; j++) {
                if (j == i) {
                    row += arr[i][j] + "]" + "\n";
                } else if (j < i) {
                    row += arr[i][j] + ",";
                }
            }
            triangle += row;
        }
        System.out.println("Tam giác bên trái: \n" + triangle);
    }

    public static void showSumDiagonal(int[][] arr) {
        System.out.println("Tổng hai đường chéo: " + getSumDiagonal(arr));
    }

    public static int getSumDiagonal(int[][] arr) {
        int sumDiagonal = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i == j || i + j == arr.length - 1) {
                    sumDiagonal += arr[i][j];
                }
            }
        }
        return sumDiagonal;
    }

    public static void showSumEven(int[][] arr) {
        getSumEven(arr);
        System.out.println("Tổng số chẵn trong mảng: " + getSumEven(arr));
    }

    public static int getSumEven(int[][] arr) {
        int sumEven = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] % 2 == 0) {
                    sumEven += arr[i][j];
                }
            }
        }
        return sumEven;
    }

    public static void printArray(int[][] arr) {
        String allArray = "";
        for (int i = 0; i < arr.length; i++) {
            String str = "[";
            for (int j = 0; j < arr[i].length; j++) {
                if (j == arr[i].length - 1) {
                    str += arr[i][j] + "]" + "\n";
                } else {
                    str += arr[i][j] + ",";
                }
            }
            allArray += str;
        }
        System.out.println(allArray);
    }

    public static int[][] createArray() {
        System.out.println("Nhập chiều dài ma trận vuông");
        int size = scanner.nextInt();
        int[][] arr = new int[size][size];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = (int) (Math.random() * 101);
            }
        }
        return arr;
    }
}