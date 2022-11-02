import java.util.ArrayList;
import java.util.Stack;

public class ConvertDecimalToBinary {

            public static ArrayList<Integer> convertDecimalToBinary(int number){
            Stack<Integer> stack = new Stack<>();
            do{
                int temp = number%2;
                stack.push(temp);
                number/=2;
            }while(number != 0);
            ArrayList<Integer> arrayList = new ArrayList<>();
            while (!stack.isEmpty()) {
                arrayList.add(stack.pop());
            }
            return arrayList;
        }
}
