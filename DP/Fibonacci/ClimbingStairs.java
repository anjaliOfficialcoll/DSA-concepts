package DP.Fibonacci;

import java.util.Arrays;

// USING RECURSIONS 5 """5 tak  pahuchne ke liye either pahle 3 tak aur 4 tak ka ways nikal lo =>fir baad mein 1 and 2 add kar do;
// O(2^n)=>recusion  O(n)=>memoization
// 70. Climbing Stairs
// Solved
// Easy
// Topics
// premium lock icon
// Companies
// Hint
// You are climbing a staircase. It takes n steps to reach the top.

// Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top
//recursion +Memoization 
public class ClimbingStairs{
    public static int climbStair(int n,int [] dp){
        //base case
        if(n==0){
            return 1;
        }
        if(n<0){
            return 0;
        }
        if(dp[n]!=-1){
            return dp[n];
        }
        //kaam
        dp[n]=climbStair(n-1,dp)+climbStair(n-2,dp);
        return dp[n];
    }

    public static void tabulation(int n){
        int dp[]=new int[n+1];
        dp[0]=1;
        dp[1]=1;
        for(int i=2;i<=n;i++){
            dp[i]=dp[i-1]+dp[i-2];
        }
        System.out.print(dp[n]);
 
    }
    public static void main(String args[]){
        int n=5;
        int dp[]=new int[n+1];
        Arrays.fill(dp,-1);
        int res=climbStair(n,dp);
        System.out.println(res);
        tabulation(n);
    }
}
