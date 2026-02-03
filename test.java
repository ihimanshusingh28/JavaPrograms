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
