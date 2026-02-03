package codeforces;

public class CountPrimes {
    class Solution {
    public int countPrimes(int n) {
        if (n <= 2) return 0;
        
        int count = 0;
        
        for (int i = 2; i < n; i++) {
            if (isPrime(i)) {
                count++;
            }
        }
        
        return count;
    }
    
    private boolean isPrime(int num) {
        if (num <= 1) return false;
        if (num == 2) return true;
        if (num % 2 == 0) return false;
        
        for (int i = 3; i * i <= num; i += 2) {
            if (num % i == 0) {
                return false;
            }
        }
        
        return true;
    }
}
}
class Solution {
    public int countPrimes(int n) {
        if (n <= 2) return 0;
        
        boolean[] isPrime = new boolean[n];
        
        // Initialize all to true (except 0 and 1)
        for (int i = 2; i < n; i++) {
            isPrime[i] = true;
        }
        
        // Mark non-primes
        for (int i = 2; i * i < n; i++) {
            if (isPrime[i]) {
                // Mark multiples of i as non-prime
                for (int j = i * i; j < n; j += i) {
                    isPrime[j] = false;
                }
            }
        }
        
        // Count primes
        int count = 0;
        for (int i = 2; i < n; i++) {
            if (isPrime[i]) {
                count++;
            }
        }
        
        return count;
    }
}