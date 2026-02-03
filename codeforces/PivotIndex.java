package codeforces;

public class PivotIndex {
    class Solution {
    public int pivotIndex(int[] nums) {
        int totalSum = 0;
        
        for (int num : nums) {
            totalSum += num;
        }
        
        int leftSum = 0;
        
        for (int i = 0; i < nums.length; i++) {
            int rightSum = totalSum - leftSum - nums[i];
            
            if (leftSum == rightSum) {
                return i;
            }
            
            leftSum += nums[i];
        }
        
        return -1;
    }
}
}
// class Solution {
//     public int pivotIndex(int[] a) {
//          int n=a.length , p =-1;
//              int sumR=0;
//              for(int i=0;i<n;i++){
//                 sumR+=a[i];
//              }
//             int sumL=0;
//             for(int i=0;i<n;i++){
//                 sumR-=a[i];
//                 if(sumR==sumL){
//                     System.out.print("pivot is = "+a[i]);
//                     p=i;
//                     break;
//                 }
//                 sumL+=a[i];
//           }
//           return p;
//       }   
    