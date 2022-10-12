import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world from MT!");
        Scanner scanner = new Scanner(System.in);
        float bmi, height, weight;
        System.out.println("Nhập chỉ số cân nặng (kg):");
        weight = scanner.nextFloat();
        System.out.println("Nhập chỉ số chiều cao (m)");
        height = scanner.nextFloat();
        bmi = weight / (height * height);
        if (bmi < 18.5){
            System.out.println("Underweight " + bmi);
        } else if (bmi < 25){
            System.out.println("Normal " + bmi);
        } else if (bmi < 30){
            System.out.println("Overweight " + bmi);
        } else {
            System.out.println("Obese");
        }
    }
}