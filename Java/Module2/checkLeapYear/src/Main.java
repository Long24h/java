import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world from MT!");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập năm cần kiểm tra:");
        int year = scanner.nextInt();
        if (year % 4 != 0){
            System.out.println("Năm " + year + " không phải là năm nhuận");
        } else if (year % 100 ==0 && year % 400 != 0) {
            System.out.println("Năm " + year + " không phải là năm nhuận");
        } else {
            System.out.println("Năm " + year + " là năm nhuận");
        }
    }
}