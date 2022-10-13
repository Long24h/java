import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Hello world from MT!");
        System.out.println("Nhập số tiền bạn muốn gửi:");
        long yourMoney = scanner.nextLong();
        System.out.println("Nhập lãi xuất cố định theo năm của ngân hàng:");
        float rate = scanner.nextFloat();
        System.out.println("Nhập kỳ hạn bạn muốn gửi:");
        int month = scanner.nextInt();
        double yourInterest = month * yourMoney * rate / 12;
        System.out.println("Tiền lãi của bạn là: " + yourInterest);
    }
}