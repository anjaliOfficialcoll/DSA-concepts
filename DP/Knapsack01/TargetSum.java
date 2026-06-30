package DP.Knapsack01;
class TargetSum{
    public static void main(String args[]){
        int numbers[]={4,2,7,1,3};
        int TargetSum=10;

        System.out.print(targetSum(numbers,TargetSum));
        
    }
    public static boolean targetSum(int num[],int ts){
        int n=num.length;
        boolean dp[][]=new boolean[n+1][ts+1];
        for(int i=0;i<dp.length;i++){
            dp[i][0]=true;
        }

        for(int i=1;i<n+1;i++){
            for(int j=1;j<ts+1;j++){
                int val=num[i-1];
                if(val<=j && dp[i-1][j-val]==true){
                    dp[i][j]=true;

                }else if(dp[i-1][j]==true){
                    dp[i][j]=true;

                }
            }
        }
        return dp[n][ts];
    }

}
