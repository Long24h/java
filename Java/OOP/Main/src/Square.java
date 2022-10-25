import myinterfaces.Comparable;
public class Square extends RectangleShape {
    //    private double size = 1.0;
    public Square() {

    }

    public Square(double size) {
        super(size, size);
    }

    public Square(String color, boolean filled, double size) {
        super(color, filled, size, size);
    }

    public double getSize() {
        return getHeight();
    }

    public void setSize(double size) {
        setWidth(size);
        setHeight(size);
    }

    public void setWidth(double size) {
        setWidth(size);
        setHeight(size);
    }

    public void setHeight(double size) {
        setHeight(size);
    }

    @Override
    public String toString() {
        return "A square with size = " + getSize() + ", which is a subclass of " + super.toString();
    }
}
