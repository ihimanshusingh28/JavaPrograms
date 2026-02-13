package codeforces;
public class MoveZerosToStart {
    public static void main(String[] args) {
        int nums[] = {0,1,2,3,4,0,5,6};
        int index = nums.length-1;
        // for(int i=arr.length-1; i>=0; i--)
        //     if(arr[i] != 0)
        //         arr[index--] = arr[i]; 

        // while(index >= 0)
        //     arr[index--] = 0;
        int j = index;
        for (int i = index ; i >=0 ; i--) {
            if (nums[i] != 0) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j--; 
                }
        }

        for(int num:nums)
            System.out.println(num);
    }
}
