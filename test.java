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
// public class test{
//     public int removeDuplicates(int[] nums) {
//         int i=0;
//         for(int elements : nums){
//             if(i==0 || i==1 || nums[i-2]!=elements){
//                 nums[i]= elements;
//                 i++;
//             }
//         }
//         return i;
//     }
//     public static void main(String[] args) {
//         int arr[]={1,1,1,2,2,3};
//         int n= arr.length;
//         for(int j : arr){
            
//         }

// }
// }




//AN Example of method overloading and overriding in java

class test{
    public int add(int a , int b){
        return a+b;
    }
}
class test1 extends test{
    
    public int add(int a , int b, int c){
        int d = a*b+c;
        return d;
    }
    public int add(int a , int b){
        return a-b;
    }

    public static void main(String[] args) {
        test t1= new test();
        test t2= new test();
        test1 t3= new test1();
        System.out.println(t1.add(10, 20));
        System.out.println(t3.add(11, 20));
        System.out.println(t3.add(10, 20, 30));
    }
}