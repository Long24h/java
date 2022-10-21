public class Fan {
    final int SLOW = 1;
    final int MEDIUM = 2;
    final int FAST = 3;
    private int speed = SLOW;
    private boolean isOn = false;
    private double radius = 5;
    private String color = "blue";

    public void setOn(boolean on) {
        isOn = on;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public boolean isOn() {
        return isOn;
    }

    public int getSpeed() {
        return speed;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public Fan() {

    }

    public Fan(int speed, boolean isOn, double radius, String color) {
        this.speed = speed;
        this.isOn = isOn;
        this.radius = radius;
        this.color = color;
    }

    public String toString() {
        String str = (this.isOn == true) ?
                "Speed " + getSpeed() + " color: " + getColor() + " radius: " + (int)getRadius() + " fan is on!" :
                "Color: " + getColor() + " radius: " + (int)getRadius() + " fan is off";
//        if (this.isOn == true){
//            str += getSpeed()+"\t"+getColor()+"\t"+getRadius()+"fan is on";
//        } else {
//            str+=getColor()+"\t"+getRadius()+"\tfan is off";
//        }
        return str;
    }

    public static void main(String[] args) {

    }
}
