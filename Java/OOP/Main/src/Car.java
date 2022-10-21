public class Car {
    public int numberOfCar;
    public static int count;
    private String name;
    private String engine;
    public Car(){};
    public Car(String name, String engine){
        this.name = name;
        this.engine = engine;
        numberOfCar = ++count;
    }
}
