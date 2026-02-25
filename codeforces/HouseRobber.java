package codeforces;

public class HouseRobber {
   class Solution {
    public int rob(int[] nums) {
        int n = nums.length;

        if (n == 1) {
            return nums[0];
        }

        // int[] arr = new int[n];

        // arr[0] = nums[0];
        // arr[1] = Math.max(nums[0], nums[1]);

        // for (int i = 2; i < n; i++) {
        //     arr[i] = Math.max(arr[i - 1], nums[i] + arr[i - 2]);
        // }

        // return arr[n - 1];  
        int p1= nums[0];
        int p2 = 0;
        for(int i=1 ; i< n ; i++) {
            int current= Math.max(p1 , p2+ nums[i]);
            p2=p1;
            p1=current;

    }
    return p1;
} 
}
}