import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Hello world!");

//        System.out.println("Nhập chiều dài hình chữ nhật:");
//        double width = scanner.nextDouble();
//        System.out.println("Nhập chiều rộng hình chữ nhật:");
//        double height = scanner.nextDouble();
//        Rectangle rectangle1 = new Rectangle(width, height);
//        rectangle1.display();

        System.out.println("Nhập hệ số a:");
        double a = scanner.nextDouble();
        System.out.println("Nhập hệ số b:");
        double b = scanner.nextDouble();
        System.out.println("Nhập hệ số c:");
        double c = scanner.nextDouble();
        QuadraticEquation quadraticEquation = new QuadraticEquation(a, b, c);
        quadraticEquation.showResult();
    }
}