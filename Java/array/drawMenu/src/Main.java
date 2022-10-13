import java.util.Scanner;

public abstract class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello world from MT!");
        System.out.println("Bạn muốn vẽ gì?");
        System.out.println("1. Vẽ hình tam  giác");
        System.out.println("2. Vẽ hình vuông");
        System.out.println("3. Vẽ hình chữ nhật");
        int choice = scanner.nextInt();
        switch (choice){
            case 1:
                System.out.println("Vẽ hình tam  giác");
                drawTriangleBotLeft();
                drawTriangleBotRight();
                drawTriangleTopLeft();
                drawTriangleTopRight();
                drawIsoscelesTriangle();
                break;
            case 2:
                System.out.println("Vẽ hình vuông");
                drawSquare();
                break;
            case 3:
                System.out.println("Vẽ hình chữ nhật");
                drawRetangle();
                break;
            default:
                System.out.println("Good bye!");
        }

    }
    public static void drawIsoscelesTriangle(){
        int hight = 10, k = 0;
        for (int i = 1; i <= hight; ++i, k = 0) {
            for (int space = 1; space <= hight - i; ++space) {
                System.out.print("  ");
            }
            while (k != 2 * i - 1) {
                System.out.print("* ");
                ++k;
            }
            System.out.println();
        }
    }


    public static void drawRetangle() {
        for (byte i = 1; i <= 5; i++) {
            for (byte j = 1; j <= 10; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void drawSquare() {
        for (byte i = 1; i <= 10; i++) {
            for (byte j = 1; j <= 10; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void drawTriangleBotLeft() {
        for (byte i = 1; i <= 10; i++) {
            for (byte j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void drawTriangleBotRight() {
        for (byte i = 1; i <= 10; i++) {
            for (byte j = 1; j <= 10; j++) {
                if (j <= (10 - i)) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }

    public static void drawTriangleTopLeft() {
        for (byte i = 10; i >= 1; i--) {
            for (byte j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void drawTriangleTopRight() {
        for (byte i = 10; i >= 1; i--) {
            for (byte j = 1; j <= 10; j++) {
                if (j <= (10 - i)) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}