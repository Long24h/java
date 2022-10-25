import myinterfaces.*;
import myinterfaces.Comparable;

public class Circle extends Shape implements Comparable {
    private double radius = 1.0;

    public Circle() {

    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    @Override
    public String getColor() {
        return super.getColor();
    }

    @Override
    public void setColor(String color) {
        super.setColor(color);
    }

    @Override
    public boolean isFilled() {
        return super.isFilled();
    }

    @Override
    public void setFilled(boolean filled) {
        super.setFilled(filled);
    }

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return "Radius = " + radius + ", area = " + getArea();
    }

    //    @Override
    public int compareTo(Object Circle) {
        Circle c1 = (Circle) Circle;
        if (this.getRadius() >= c1.getRadius()) {
            return 1;
        } else {
            return -1;
        }
    }

    public static int compareTwo(Circle C1, Circle C2) {
        if (C1.getRadius() >= C2.getRadius()) {
            return 1;
        } else {
            return -1;
        }
    }

    @Override
    public void resize(double percent) {
        setRadius(getRadius()*(1+ percent));
    }
}
