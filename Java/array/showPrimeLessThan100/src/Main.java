public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world from MT!");
        System.out.println(showPrimeLessThan100());
    }
    public static String showPrimeLessThan100(){
        int number = 2;
        String str = "";
        while (number <=100){
            if (checkPrime(number)){
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