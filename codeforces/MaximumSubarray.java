package codeforces;

public class MaximumSubarray {
 class Solution {
    public int maxSubArray(int[] nums) {
        int n=nums.length;
      int maxi = Integer.MIN_VALUE; 
        int sum = 0;

        for (int i = 0; i < n; i++) 
        {

            sum +=nums[i];

            if (sum < nums[i]) {
                sum = nums[i];
            }
            
            if(sum > maxi){
                maxi = sum;
            }
        }
        return maxi;  
    }
}
}
class Solution1 {
    public int maxSubArray(int[] nums) {
        return maxSubArrayDivideConquer(nums, 0, nums.length - 1);
    }
    
    private int maxSubArrayDivideConquer(int[] nums, int left, int right) {
        if (left == right) return nums[left];
        
        int mid = left + (right - left) / 2;
        
        int leftMax = maxSubArrayDivideConquer(nums, left, mid);
        int rightMax = maxSubArrayDivideConquer(nums, mid + 1, right);
        int crossMax = maxCrossingSum(nums, left, mid, right);
        
        return Math.max(Math.max(leftMax, rightMax), crossMax);
    }
    
    private int maxCrossingSum(int[] nums, int left, int mid, int right) {
        int sum = 0;
        int leftSum = Integer.MIN_VALUE;
        
        
        for (int i = mid; i >= left; i--) {
            sum += nums[i];
            leftSum = Math.max(leftSum, sum);
        }
        
        sum = 0;
        int rightSum = Integer.MIN_VALUE;
        
        
        for (int i = mid + 1; i <= right; i++) {
            sum += nums[i];
            rightSum = Math.max(rightSum, sum);
        }
        
        return leftSum + rightSum;
    }
}
