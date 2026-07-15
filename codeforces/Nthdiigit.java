package codeforces;

public class Nthdiigit {
    public static void main(String[] args) {
    int result = findNthDigit(11);
    System.out.println(result);
    }

    public static int findNthDigit(int n) {
        long start = 1;          
        long count = 9;          
        int digitLength = 1;     
        
        while (n > count * digitLength) { //here finding group
            n -= count * digitLength;  
            count *= 10;              
            start *= 10;              
            digitLength++;            
        }
        long number = start + (n - 1) / digitLength; //here finding exact number
        int index = (n - 1) % digitLength; //here finding digit within number
        return String.valueOf(number).charAt(index) - '0';
}

    }
