import java.util.Scanner;

public class CalculationExample {
    private Scanner scanner = new Scanner(System.in);
    public CalculationExample(){
        calc();
    }
    private void calc(){
        try {
            System.out.println("Nhập số a:");
            double a = Double.parseDouble(scanner.nextLine());
            System.out.println("Nhập số b:");
            double b = Double.parseDouble(scanner.nextLine());
            double sum, sub, mult, div;
            sum = a + b;
            sub = a - b;
            mult = a * b;
            div = a / b;
            System.out.println("Tổng hai số là: " + sum);
            System.out.println("Hiệu hai số là: " + sub);
            System.out.println("Tích hai số là: " + mult);
            System.out.println("Thương hai số là: " + div);
        } catch (Exception e){
            System.err.println("Xảy ra ngoại lệ: " + e.getMessage());
        }

    }
}
