package Stacks;
import java.util.Stack;

public class BalancedSymbols {
    public static boolean isBalanced(String str){
        Stack<Character> stack= new Stack<>();
        for(char ch : str.toCharArray()){
            if(ch=='(' || ch=='{' || ch=='['){
                stack.push(ch);
            }
            else if(ch==')' || ch=='}' || ch==']'){
                if(stack.isEmpty()){
                    return false;
                }
                char top= stack.peek();
                if((ch==')' && top=='(') || (ch=='}' && top=='{') || (ch==']' && top=='[')){
                    stack.pop();
                }
                else{
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
    public static void main(String[] args) {
        String str= "{[()]})";
        System.out.println(isBalanced(str));
    }   
}
