public class Cylinder extends Circle{
    private double height = 1.0;
    public Cylinder(){

    }
    public Cylinder(String color, boolean filled, double radius, double height){
        super(color, filled, radius);
        this.height = height;
    }
    public Cylinder(double radius, double height){
        super(radius);
        this.height = height;
    }
    public double getHeight(){
        return this.height;
    }
    public void setHeight(double height){
        this.height = height;
    }

    @Override
    public double getArea() {
        return super.getPerimeter()*(getRadius() + height);
    }

    public double getVolume() {
        return super.getArea()*height;
    }
    public String toString(){
        return "Cylinder has radius = " + getRadius() + ", area = " + getArea()
                + ", volume = " + getVolume();
    }
}
