package Stacks;
import java.util.Stack;
public class StackPermutation {
    public static boolean isStackPermutation(int[] input, int[] output) {
        Stack<Integer> stack = new Stack<>();
        int j = 0;
        for (int i = 0; i < input.length; i++) {
            stack.push(input[i]);
            while (!stack.isEmpty() && stack.peek() == output[j]) {
                stack.pop();
                j++;
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        int[] input = {1, 2, 3, 4, 5, 6};
        int[] output = {1,3,2,5,6,4};
        System.out.println(isStackPermutation(input, output)); 
    }
}
