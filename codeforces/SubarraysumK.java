package codeforces;
public class SubarraysumK {
    class Solution {
    public int subarraySum(int[] nums, int k) {
        int sum=0 ;
        int count=0;
        for(int left=0; left<nums.length;left++){
            for(int right=left; right<nums.length;right++){
                sum+=nums[right];
                if(sum==k){
                    count++;
                }
            }
            sum=0;
        }
        return count;
    }
}
class Solution2{
    
}
}
