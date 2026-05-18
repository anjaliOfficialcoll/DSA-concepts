package Arrays;

import java.util.Scanner;

public class TrapRain {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(trappedRain(arr));
    }

    private static int trappedRain(int[] height) {
        int n=height.length;
        if(n==0){
            return 0;
        }
        int leftMax[]=new int[n];
        int [] rightMax=new int[n];
        leftMax[0]=height[0];
        for(int i=1;i<n;i++){
            leftMax[i]=Math.max(leftMax[i-1],height[i]);

        }
        rightMax[n-1]=height[n-1];
        for(int i=n-2;i>=0;i--){
            rightMax[i]=Math.max(rightMax[i+1],height[i]);

        }
        int trappedWater=0;
        for(int i=0;i<n;i++){
            int waterlevel=Math.min(leftMax[i],rightMax[i]);
            trappedWater+=waterlevel-height[i];
        }
        return trappedWater;
    }
    
}
