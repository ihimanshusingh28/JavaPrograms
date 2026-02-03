package codeforces;

class Solution {
    public boolean isHappy(int n) {
        while (n >= 10) {
            int sum = 0;
            while (n > 0) {
                sum += Math.pow(n % 10, 2);
                n /= 10;
            }
            n = sum;
        }
        if (n == 7)
            return true;
        if (n < 10 && n != 1)
            return false;
        return true;
    }
}

public class HappyNumber {
    public static void main(String[] args) {
        Solution s1 = new Solution();
        System.out.println(s1.isHappy(19));
    }
}



    
