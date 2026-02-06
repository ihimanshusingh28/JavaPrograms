public class RotatedClockwise {
    public static void main(String[] args) {
        int a[]={1,2,3,4,5,6,7};
        int k=3;
        System.out.println("hello");
        int n= a.length;
        if(n==0)return;
        k=k%n;
        int i,j ;
        for (i=n-k , j=n-1; i<j ; i++ , j--){
            int temp=a[i];
            a[i]=a[j];
            a[j]=temp;
}
        for(i=0 , j=n-k-1 ; i<j; i++ ,j--){
             int temp=a[i];
            a[i]=a[j];
            a[j]=temp;
        }
        for(i=0 , j= n-1 ; i<j ; i++, j--){
           int temp=a[i];
            a[i]=a[j];
            a[j]=temp;
        }
        
    }
}

