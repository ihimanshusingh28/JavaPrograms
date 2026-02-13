package codeforces;

public class SquaresofsortedArray {
    public int[] sortedSquares(int[]arr){
        int n=arr.length;
        int [] result= new int[n];
        int i = 0, j = n - 1;
        for (int h = n - 1; h >= 0; h--) {
            if (Math.abs(arr[i]) > Math.abs(arr[j])) {
                result[h] = arr[i] * arr[i];
                i++;
            } else {
                result[h] = arr[j] * arr[j];
                j--;
            }
        }
        return result;

    }
}
