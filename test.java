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
public class test{
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
        for(i=0;i<n-1;i++){
            System.out.println(a);
        }
    }
}