import java.util.Stack;

public class ReverseArrayNumberByStack {


    public static int[] reverseArr(int[] arr){
        Stack<Integer> stack = addToStack(arr);
        int[] arr1 = returnArrReverse(stack);
        return arr1;
    }
    public static int[] returnArrReverse(Stack stack){
        int[] arr = new int[stack.size()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) stack.pop();
        }
        return arr;
    }

    public static Stack addToStack(int[] arr){
        Stack<Integer> stack = new Stack<>();
        for (int item : arr) {
            stack.push(item);
        }
        return stack;
    }
    public static int randomNumber(){
        int random =(int) Math.floor(Math.random()*(100 - 50 +1)) + 50;
        return random;
    }
    public static int[] makeRandomArr(){
        int[] arr = new int[10];
        for(int i = 0; i < arr.length; i++){
            arr[i] = randomNumber();
        }
        return arr;
    }
    public static String printArr(int[] arr){
        String str = "";
        for (int item : arr) {
            str += item + " ";
        }
        return str;
    }
}
