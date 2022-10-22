public class Circle extends Shape{
    private double radius = 1.0;
    public Circle(){

    }
    public Circle(double radius){
        this.radius = radius;
    }
    public Circle(String color, boolean filled, double radius){
        super(color, filled);
        this.radius = radius;
    }

    @Override
    public String getColor() {
        return super.getColor();
    }
    @Override
    public void setColor(String color){
        super.setColor(color);
    }
    @Override
    public boolean isFilled(){
        return super.isFilled();
    }
    @Override
    public void setFilled(boolean filled){
        super.setFilled(filled);
    }
    public double getRadius(){
        return this.radius;
    }
    public void setRadius(double radius){
        this.radius = radius;
    }
    public double getArea(){
        return Math.PI*radius*radius;
    }
    public double getPerimeter(){
        return 2*Math.PI*radius;
    }
    @Override
    public String toString(){
        return "A cirle with radius = " + radius + ", which is a subclass of " + super.toString();
    }
}
