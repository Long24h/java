import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world from MT!");
        Scanner scanner = new Scanner(System.in);
        int usd;
        System.out.println("Nhập số USD bạn có:");
        usd = scanner.nextInt();
        int rate = 23000;
        int vnd = usd * rate;
        System.out.println("Số tiền sau khi quy đổi là: " + vnd);


    }
}