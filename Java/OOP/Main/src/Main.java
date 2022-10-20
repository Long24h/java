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

//        System.out.println("Nhập hệ số a:");
//        double a = scanner.nextDouble();
//        System.out.println("Nhập hệ số b:");
//        double b = scanner.nextDouble();
//        System.out.println("Nhập hệ số c:");
//        double c = scanner.nextDouble();
//        QuadraticEquation quadraticEquation = new QuadraticEquation(a, b, c);
//        quadraticEquation.showResult();
//        StopWatch stopWatch = new StopWatch();
//        stopWatch.runStopWatch();

        StaticMethod student1 = new StaticMethod("chicken");
        StaticMethod student2 = new StaticMethod("duck");
        StaticMethod student3 = new StaticMethod("bird");

        student1.display();
        student2.display();

        StaticMethod.change();
        student3.display();


    }
}