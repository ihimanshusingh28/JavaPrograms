package codeforces;

 class Solution {
    public void Sortcol(int []nums){
        int n= nums.length;
        int low= 0;
        int mid= 0;
        int high= n-1;
        while(mid<=high){
            if(nums[mid]==0){
                int temp = nums[low];
                nums[low++]= nums[mid];
                nums[mid++]= temp;
            }
            else if (nums[mid]==1){
                mid++;
            }
            else {
                int temp= nums[high];
                nums[high--]=nums[mid];
                nums[mid]= temp;
            }
        }
        

    }
}
 public class SortColor {
    public static void main(String[] args) {
        int [] arr = {0,1,2,0,1,2};
        Solution s= new Solution();
        s.Sortcol(arr);
        for (int num : arr)
            System.out.println(num);
    }

    
}
