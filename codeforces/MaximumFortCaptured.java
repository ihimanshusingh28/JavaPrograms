package codeforces;

public class MaximumFortCaptured {
    class Solution {
    public int captureForts(int[] forts) {
        
        int n = forts.length;
        int ans = 0;
         for (int i = 0; i < n; i++) {
            int count = 0;
            if (forts[i] == 1) {
                for (int j = i + 1; j < n; j++) {

                    if (forts[j] == 0) {
                        count++;
                    } 
                    else if (forts[j] == -1) {
                        ans = Math.max(ans, count);
                        break;
                    } 
                    else {
                        break;
                    }
                }

                count = 0;

                
                for (int j = i - 1; j >= 0; j--) {

                    if (forts[j] == 0) {
                        count++;
                    } 
                     else if (forts[j] == -1) {
                        ans = Math.max(ans, count);
                        break;
                    } 
                    else {
                        break;
                    }
                    
                }
            }
        }

        return ans;
    }
}

}
