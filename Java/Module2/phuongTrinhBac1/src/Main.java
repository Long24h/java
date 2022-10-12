import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println("Giai phuong trinh ax + b = 0");
        Scanner scanner = new Scanner(System.in);
        double a, b, x;
        System.out.println("Nhap he so a:");
        a = scanner.nextDouble();
        System.out.print("Nhập he so b: ");
        b = scanner.nextDouble();
        if (a == 0 && b == 0){
            System.out.println("Phuong trinh co vo so nghiem");
        } else if (a == 0 && b != 0){
            System.out.println("Phuong trinh vo nghiem");
        } else {
            x = -b / a;
            System.out.println("Phuong trinh co nghiem la: " + x );
        }
    }
}