package Bit_Manipulation;

public class Reversebits {
    public static int reversebit(int n){
        int result = 0;
        
        for (int i = 0; i < 32; i++) {
            result = (result << 1) | ((n >> i) & 1);
        }
        
        return result;
    }
    public static void main(String[] args) {
        int n = 10;
        System.out.println(reversebit(n));
    }
}
