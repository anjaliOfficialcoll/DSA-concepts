package DP.Knapsack01;

public class Knapsack01 {
    public static int knapsackMemo(int[] profit,int []itemWt,int maxWt,int n,int[][] dp){
        //base case
        if(n==0 || maxWt==0){
            return 0;
        }
        if(dp[n][maxWt]!=0){
            return dp[n][maxWt];
        }
        if(itemWt[n-1]<=maxWt){
            //include
            int ans1=profit[n-1]+knapsackMemo(profit,itemWt,maxWt-itemWt[n-1],n-1,dp);
            //exclude
            int ans2=knapsackMemo(profit,itemWt,maxWt,n-1,dp);
             dp[n][maxWt]=Math.max(ans1,ans2);
            return dp[n][maxWt];
        }else{
            dp[n][maxWt]=knapsackMemo(profit,itemWt,maxWt,n-1,dp);
            return dp[n][maxWt];

        }


    }
    public static void tabulation(){
         int profit[]={15,14,10,45,30};
        int n=profit.length;
        int itemWeight[]={2,5,1,3,4};
        int maxWeight=7;
        int dp[][]=new int[n+1][maxWeight+1];
        // intial with -1
        
        for(int i=0;i<=n;i++){
          dp[0][i]=0;
        }
        for(int j=0;j<dp[0].length;j++){
            dp[0][j]=0;
        }
        //dp[0][0]=0;
        
        for(int i=1;i<dp.length;i++){
            for(int j=1;j<dp[0].length;j++){
                int v=profit[i-1];
                int w=itemWeight[i-1];
                if(w<=j){
                    int incPro=v+dp[i-1][j-w];
                    int excPro=dp[i-1][j];
                    dp[i][j]=Math.max(incPro,excPro);
                }else{
                    int excPro=dp[i-1][j];
                    dp[i][j]=excPro;
                }
                

            }
        }
        System.out.println("Tabulation "+dp[n][maxWeight]);

    }
    public static void main(String args[]){
        
        int profit[]={15,14,10,45,30};
        int n=profit.length;
        int itemWeight[]={2,5,1,3,4};
        int maxWeight=7;
        int dp[][]=new int[n+1][maxWeight+1];
        System.out.println("Memoization "+ knapsackMemo(profit,itemWeight,maxWeight, n,dp));
        tabulation();

    }
    
}
