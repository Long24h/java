import myinterfaces.*;
public class Triangle extends Shape {
    private double side1 = 1.0, side2 = 1.0, side3 = 1.0;

    public double getSide1() {
        return this.side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return this.side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return this.side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    public Triangle() {

    }

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public Triangle(String color, boolean filled, double side1, double side2, double side3) {
        super(color, filled);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getPerimeter() {
        return (getSide1() + getSide2() + getSide3());
    }

    public double getArea() {
        double p = getPerimeter() / 2;
        return Math.sqrt(Math.abs(p*(p - getSide1())*(p - getSide2())*(p - getSide3())));
    }
    @Override
    public String toString(){
        return "This triangle has: side1 = " + getSide1() + ", side2 = " + getSide2() + ", side3 = "
                + getSide3() + ". With perimeter = " + getPerimeter()
                + ", and area = " + getArea() + ". Color: " + getColor()
                + ", and " + (isFilled() ? "filled" : "no filled.");
    }
    public int compareTo(Object triangle) {
        Triangle c1 = (Triangle) triangle;
        if (this.getArea() >= c1.getArea()) {
            return 1;
        } else {
            return -1;
        }
    }

    @Override
    public void resize(double percent) {
        setSide1(getSide1()*(1+ percent));
        setSide2(getSide2()*(1+ percent));
        setSide3(getSide3()*(1+ percent));
    }

    public static void main(String[] args) {
        Triangle tri = new Triangle(3, 4, 5);
        System.out.println(tri.getPerimeter());
        System.out.println(tri.getArea());
        System.out.println(tri.toString());
    }
}
