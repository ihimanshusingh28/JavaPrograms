public class test3 {
    public static void main(String[]args){
        int result=factorial(5);
        System.out.println(result);
        int result1=factorialbytabulation(5);
        System.out.println(result1);
    }
    public static int factorial(int n){
        if(n==0 || n==1){
            return 1;
        }
        return n*factorial(n-1);
    }
    public static int factorialbytabulation(int n){
        int[] dp=new int[n+1];
        dp[0]=1;
        dp[1]=1;
        for(int i=2;i<=n;i++){
            dp[i]=i*dp[i-1];
        }
        return dp[n];
    }
}
