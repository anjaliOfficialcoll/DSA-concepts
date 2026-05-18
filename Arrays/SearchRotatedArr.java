package Arrays;

import java.util.Scanner;

public class SearchRotatedArr {
    public static int searchInRotatedArr(int arr[],int target){
        int start=0;int end=arr.length-1;
        
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==target){
                return mid;
            }
            if(arr[start]<=arr[mid]){
                //left is sorted arr
                if(arr[start]<=target && target<=arr[mid]){
                    end=mid-1;
                } else{
                    start=mid+1;
                }
            } else{
                //right is sorted arr
                if(arr[mid]<=target && target<=arr[end]){
                    start=mid+1;
                } else{
                    end=mid-1;
                }
            }
        }
        return -1;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int target=sc.nextInt();
        System.out.print(searchInRotatedArr(arr, target));

    }
    
}
