import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello world from MT!");
        System.out.println(show20Prime());
    }

    public static String show20Prime(){
        int count =0, number =2;
        String str = "";
        while (count<20){
            if (checkPrime(number)){
                count++;
                str += number + " ";
                number++;
            } else {
                number++;
            }
        }
        return str;
    }
    public static boolean checkPrime(int number){
        boolean flag = true;
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            } else if (i == number -1){
                return true;
            }
        }
        return flag;
    }
}