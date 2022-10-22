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

//        Student std1 = new Student();
//        std1.setName("Leesin");
//        std1.setClasses("C0822G1");
//        System.out.println(std1.getName());
//        System.out.println(std1.getClasses());

        Shape shape = new Shape();
        System.out.println(shape.toString());

        Shape shape5 = new Shape("red", false);
        System.out.println(shape5.toString());

        Circle circle = new Circle("white", true, 4);
        System.out.println(circle.getArea());
        System.out.println(circle.getPerimeter());
        System.out.println(circle.toString());

//        Circle c1 = new Circle(8);
//        System.out.println(c1.getArea());
//        System.out.println(c1.getPerimeter());
//        System.out.println(c1.toString());

        RectangleShape rec1 = new RectangleShape("red", true, 7, 11);
        System.out.println(rec1.getArea());
        System.out.println(rec1.getPerimeter());
        System.out.println(rec1.toString());
        System.out.println(rec1.getColor());

        Square square = new Square("pink", false, 9);
        System.out.println(square.getArea());
        System.out.println(square.getPerimeter());
        System.out.println(square.toString());
        System.out.println(square.getColor());

    }
}