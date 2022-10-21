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

//        StaticMethod student1 = new StaticMethod("chicken");
//        StaticMethod student2 = new StaticMethod("duck");
//        StaticMethod student3 = new StaticMethod("bird");
//
//        student1.display();
//        student2.display();
//
//        StaticMethod.change();
//        student3.display();

//        Fan fan1 = new Fan( 3, true, 7, "yellow");
//        System.out.println(fan1.toString());

//        Car car1 = new Car("Lambo", "Diezel");
//        System.out.println(car1.numberOfCar);
//        Car car2 = new Car("BMW", "Electric");
//        System.out.println(car2.numberOfCar);

        Student std1 = new Student();
        std1.setName("Leesin");
        std1.setClasses("C0822G1");
        System.out.println(std1.getName());
        System.out.println(std1.getClasses());


    }
}