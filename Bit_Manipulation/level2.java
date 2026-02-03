package Bit_Manipulation;

public class level2 {
    public static void main(String[] args) {
        // To count total set bits
        int n=64;
        int count = 0;
        while(n>0){
            n= n & (n-1);
            count++;
        }
        System.out.println(count);

        //To check power of 2
        int m= 64;
        boolean isPowerOfTwo = ( m> 0) && ((m & (m - 1)) == 0);
        System.out.println(isPowerOfTwo);

        //Find the only non-repeating element
       int[] arr = {10, 10, 20, 10, 40};
       int result = 0;

      for (int num : arr) {
           result ^= num;   
}
        System.out.println(result);

        //To swap numbers without using temp var
        int a=10;
        int b= 8;
        a= a ^ b;
        b= a ^ b;
        a = a ^b;
        System.out.println(a);
        System.out.println(b);

        //To find a missing number in arr
        int [] arr1={2,3,4,5,7,8};


    }
}
