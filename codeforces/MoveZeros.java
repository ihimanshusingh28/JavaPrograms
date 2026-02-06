package codeforces;
public class MoveZeros {
    public static void main(String[] args) {
        int arr[] = {0,1,2,3,4,0,5,6};
        int count=0;
        for(int i=0; i<arr.length;i++)
            if(arr[i]==0)
                count+=1;
        System.out.println(count);

        int index = arr.length-1;
        for(int num=arr.length-1; num>=count; num-- )
            if (num !=0)
                arr[index--] = num;

        // while (index < arr.length)
        //     arr[index++] = 0;
        for(int j=0;j<count;j++)
            arr[j]=0;

        for(int num : arr)
            System.out.println(num);
        
        

        


     }
}
