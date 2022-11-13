package refactoring;

public class Cylinder {
    public static double getVolume(int radius, int height){
        return getPerimeterCicle(radius) * height + 2 * getAreaCicle(radius);
    }

    public static double getAreaCicle(int radius) {
        return Math.PI * radius * radius;
    }
    public static double getPerimeterCicle(int radius) {
        return 2 * Math.PI  * radius;
    }
}
