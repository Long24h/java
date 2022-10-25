import myinterfaces.Comparable;
import myinterfaces.Resizeable;

public abstract class Shape implements Comparable, Resizeable {
    private String color = "green";
    private boolean filled = true;
    public Shape(){
    }
    public Shape(String color, boolean filled){
        this.color= color;
        this.filled = filled;
    }
    public String getColor(){
        return this.color;
    }
    public void setColor(String color){
        this.color = color;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public boolean isFilled() {
        return filled;
    }
//    @Override
    public String toString(){
        return "A shape with color of " + color + " and " + (isFilled() ? "filled" : "not filled");
    }
    public abstract double getArea();
}
