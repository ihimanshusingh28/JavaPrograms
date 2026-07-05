package Stacks;
import java.util.Stack;
public class ArraywithkStacks {
    int[] arr;
    int[] top;
    int[] next;
    int free;

    public ArraywithkStacks(int k, int n) {
        arr = new int[n];
        top = new int[k];
        next = new int[n];
        for (int i = 0; i < k; i++) {
            top[i] = -1;
        }
        for (int i = 0; i < n - 1; i++) {
            next[i] = i + 1;
        }
        next[n - 1] = -1;
        free = 0;
    }

    public void push(int item, int sn) {
        if (free == -1) {
            System.out.println("Stack Overflow");
            return;
        }
        int i = free;
        free = next[i];
        arr[i] = item;
        next[i] = top[sn];
        top[sn] = i;
    }

    public int pop(int sn) {
        if (top[sn] == -1) {
            System.out.println("Stack Underflow");
            return Integer.MIN_VALUE;
        }
        int i = top[sn];
        top[sn] = next[i];
        next[i] = free;
        free = i;
        return arr[i];
    }
}
