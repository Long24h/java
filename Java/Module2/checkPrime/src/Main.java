import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world from MT!");
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập số cần kiểm tra:");
        int number = input.nextInt();
        if (number < 2){
            System.out.println("Số không hợp lệ!");
        } else if (number == 2) {
            System.out.println(number + " là số nguyên tố!");
        } else {
            for (int i = 2; i < number; i++){
                if (number % i == 0){
                    System.out.println(number + " không phải số nguyên tố!");
                    return;
                } else if (i == number -1){
                    System.out.println(number + " là số nguyên tố");
                    return;
                }
            }
        }
    }
}