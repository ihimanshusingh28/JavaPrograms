package Stacks;
import java.util.Stack;
public class MonotonicStack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        int[] arr = {1, 3, 2, 5, 4};
        for (int num : arr) {
            while (!stack.isEmpty() && stack.peek() < num) {
                stack.pop();
            }
            stack.push(num);
        }
        System.out.println(stack);
    }

}
