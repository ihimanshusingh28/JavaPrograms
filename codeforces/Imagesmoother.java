package codeforces;

public class Imagesmoother {
    public int[][] imageSmoother(int[][] img) {
        int m=img.length;
        int n=img[0].length;
        int [][]arr = new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                int sum = img[i][j],count = 1;
                if(i-1>=0){
                    sum+=img[i-1][j];
                    count++;
                }
                if(j-1>=0){
                    sum+=img[i][j-1];
                    count++;
                }
                if(i+1<m){
                    sum+=img[i+1][j];
                    count++;
                }
                if(j+1<n){
                    sum+=img[i][j+1];
                    count++;
                }
                if(i-1>=0 && j-1>=0){
                    sum+=img[i-1][j-1];
                    count++;
                }
                if(j-1>=0 && i+1<m){
                    sum+=img[i+1][j-1];
                    count++;
                }
                if(i+1<m && j+1<n){
                    sum+=img[i+1][j+1];
                    count++;
                }
                if(j+1<n && i-1>=0){
                    sum+=img[i-1][j+1];
                    count++;
                }
                // sum+=img[i][j];count++;
                arr[i][j] = sum/count;
            }
        }
        return arr;
    }
}
