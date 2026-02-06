package codeforces;
public class MoveZerosToStart {
    public static void main(String[] args) {
        int arr[] = {0,1,2,3,4,0,5,6};
        int index = arr.length-1;
        for(int i=arr.length-1; i>=0; i--)
            if(arr[i] != 0)
                arr[index--] = arr[i]; 

        while(index >= 0)
            arr[index--] = 0;

        for(int num:arr)
            System.out.println(num);
    }
}
