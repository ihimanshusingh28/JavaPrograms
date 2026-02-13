package codeforces;

public class MaximumConsecutiveOnes {
    public static void main(String[] args) {
        int []arr ={1,1,0,3,4,1,1,1,1,0,0,1,1,1};
        int maxcount=0;
        int currentcount=0;
        for(int i=0 ; i< arr.length ; i++){
            if(arr[i]==1){
                currentcount++;
            maxcount=Math.max(maxcount, currentcount);
            }
            else{ 
                currentcount=0;
            }

        }
        System.out.println(maxcount);

    }
}
