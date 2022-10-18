import java.util.Scanner;

public class ConvertTemperature {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {



    }

    public static void convertCelsiusToFahrenheit(){
        System.out.println("Nhập chỉ số nhiệt độ theo Celsius:");
        double celsius = scanner.nextInt();
        double fahrenheit = (9.0/5.0)*celsius + 32;
        System.out.println(celsius + " độ C bằng " + fahrenheit + " độ F!");
    }
    public static void convertFahrenheitToCelsius(){
        System.out.println("Nhập chỉ số nhiệt độ theo Fahrenheit:");
        double fahrenheit = scanner.nextInt();
        double celsius = (5.0/9.0)*(fahrenheit - 32);
        System.out.println(fahrenheit + " độ F bằng " + celsius + " độ C!");
    }
}
