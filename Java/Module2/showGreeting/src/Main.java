import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world from MT!");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.print("Hello: " + name);
    }
}