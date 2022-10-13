import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello world from MT!");
        int a, b, ucLn = 1;
        System.out.println("Nhập số a:");
        a = scanner.nextInt();
        System.out.println("Nhập số b:");
        b = scanner.nextInt();
        for (int i=1;i<=a && i<=b;i++){
            if (a%i==0 && b%i==0){
                ucLn =i;
            }
        }
        System.out.printf("UCLN của %d và %d là %d",a , b, ucLn);
    }
}