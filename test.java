// class Sol {
//        void pivot(int a[]){
//              int n=a.length;
//              int sumR=0;
//              for(int i=1;i<n;i++)
//                 sumR+=a[i];
//             int sumL=0;
//             for(int i=1;i<n;i++){
//                 sumL+=a[i-1];
//                 sumR-=a[i];
//                 if(sumR==sumL){
//                     System.out.print("pivot is = "+a[i]);
//                 }
//             }
//        }    
// }
// public class test {
//     public static void main(String args[]){
//      int a[]={3,1,5,2,2};
//     Sol p=new Sol();
//     p.pivot(a);
// }
// }
// public class test{
//     public static void main(String[] args) {
//         int a[]={1,2,3,4,5,6,7};
//         int i ,j ;
//         for(i=0 , j =a.length-1; i<j ; i++ , j--){
//             a[i]^=a[j];
//             a[j]^=a[i];
//             a[i]^=a[j];

//         }
//         for(int nums: a){
//              System.out.println(a[nums]);
//         }
//         int k=3;
//         System.out.println("hello");
//         int n= a.length;
//         if(n==0)return;
//         k=k%n;
//         int i,j ;
//         for (i=n-k , j=n-1; i<j ; i++ , j--){
//             int temp=a[i];
//             a[i]=a[j];
//             a[j]=temp;
// }
//         for(i=0 , j=n-k-1 ; i<j; i++ ,j--){
//              int temp=a[i];
//             a[i]=a[j];
//             a[j]=temp;
//         }
//         for(i=0;i<n-1;i++){
//             System.out.println(a);
//         }
//     }
// }
public class test{
    public static void main(String[] args) {
        int arr[]={2,7,9,3,1};
        int n= arr.length;
        int sum1=0;

        for(int i=0;i<n;i+=2){
            sum1+=arr[i];
        }
        int sum2=0;
        for(int i=1;i<n;i+=2){
            sum2+=arr[i];
    }
    int Max= Math.max(sum1, sum2);
    System.out.println(Max);

}
}




//A med-Inventory app to be build
//