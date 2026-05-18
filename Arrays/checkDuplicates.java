package Arrays;

import java.util.HashMap;
import java.util.Scanner;

public class checkDuplicates {
    public static boolean checkDuplicate(int n,int arr[]){
        HashMap<Integer,Integer> map=new HashMap<>();
       
        for(int i=0;i<n;i++){
           if(map.containsKey(arr[i])){
            return true;

           }else{
            map.put(arr[i],1);
           }
        }
        return false;


    }
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print(checkDuplicate( n, arr));
    }

    
    
}
