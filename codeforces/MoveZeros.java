package codeforces;
public class MoveZeros {
    public static void main(String[] args) {
        int nums[] = {0,1,2,3,4,0,5,6};
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++; 
                }
        }

        for(int num : nums)
            System.out.println(num);

     }
}
