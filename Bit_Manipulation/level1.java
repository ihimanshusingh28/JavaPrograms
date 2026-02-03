package Bit_Manipulation;

public class level1 {
    public static void main(String[] args) {
        //To check odd-even
        int n = 10;
        if((n & 1) ==0){
            System.out.println("Even");
        }
        else{
            System.out.println("odd");
        }
        //To check if ith bit is a set
        int i= 0;
        boolean isSet = (n & (1 << i)) != 0;
        System.out.println(isSet);
        
        // To set ith bit
        System.out.println(n | (1<< i));
    // To clear ith Set bit
    System.out.println(n & ~(1<< i));
    
   //Toggle ith bit 
    System.out.println(n ^ (1 << i));
    

    
}
}
