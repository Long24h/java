import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        float height, width, area;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập chiều dài:");
        width = scanner.nextFloat();
        System.out.println("Nhập chiều cao:");
        height = scanner.nextFloat();
        area = height * width;
        System.out.println("Diện tích hình chữ nhật là: " + area);
    }
}