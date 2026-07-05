package Stacks;
import java.util.Stack;

public class LargestRectHIsto {
        public static int largestRectangleArea(int[] heights) {
            int n = heights.length;
            int maxArea = 0;
            Stack<Integer> stack = new Stack<>();
            for (int i = 0; i <= n; i++) {
                int currentHeight = (i == n) ? 0 : heights[i];
                while (!stack.isEmpty() && currentHeight < heights[stack.peek()]) {
                    int height = heights[stack.pop()];
                    int width = stack.isEmpty() ? i : (i - stack.peek() - 1);
                    maxArea = Math.max(maxArea, height * width);
                }
                stack.push(i);
            }
            return maxArea; 
        }
    
        public static void main(String[] args) {
            int[] heights = {2,1,5,6,2,3};
            int result = largestRectangleArea(heights);
            System.out.println("Largest Rectangle Area: " + result);
        }
}
