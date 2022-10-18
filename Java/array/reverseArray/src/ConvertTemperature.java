import java.util.Scanner;

public class ConvertTemperature {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int choose;
        do {
            System.out.println("Chọn nhiệt độ muốn quy đổi:");
            System.out.println("1. Đổi từ độ C sang độ F:");
            System.out.println("2. Đổi từ độ F sang độ C:");
            choose = scanner.nextInt();
            switch (choose){
                case 1:
                    convertCelsiusToFahrenheit();
                    break;
                case 2:
                    convertFahrenheitToCelsius();
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.exit(0);
            }
        }while(choose != 0);





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
