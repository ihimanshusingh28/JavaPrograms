package codeforces;

public class TwoSum2 {
    class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int l = 0;
        int r = numbers.length - 1;
        int[] ans = new int[2];

        while (l < r) {
            int sum = numbers[l] + numbers[r];

            if (sum == target) {
                break;
            } else if (sum > target) {
                r--;
            } else {
                l++;
            }
        }

        ans[0] = l + 1; 
        ans[1] = r + 1;

        return ans;
    }
}
}
