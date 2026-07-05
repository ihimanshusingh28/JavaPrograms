package Stacks;
import java.util.Stack;
public class Findingspans {
    public static int[] findSpans(int[] prices) {
        int n = prices.length;
        int[] spans = new int[n];
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && prices[stack.peek()] <= prices[i]) {
                stack.pop();
            }
            spans[i] = stack.isEmpty() ? (i + 1) : (i - stack.peek());
            stack.push(i);
        }
        return spans;
    }

    public static void main(String[] args) {
        int[] prices = {6,3,4,5,2};
        int[] spans = findSpans(prices);
        for (int span : spans) {
            System.out.print(span + " ");
        }
    }
}
