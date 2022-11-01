import java.util.Stack;

public class ReverseArrayStringByStack {

    public static String reverseString(String str){
        Stack<Character> stack = addStringToStack(str);
        String str1 = returnStringReverse(stack);
        return str1;
    }
    public static String returnStringReverse(Stack stack){
        String str = "";
        int length = stack.size();
        for (int i = 0; i < length; i++) {
            str += stack.pop();
        }
        return str;
    }
    public static Stack addStringToStack(String str){
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            stack.push(str.charAt(i));
        }
        return stack;
    }
}
