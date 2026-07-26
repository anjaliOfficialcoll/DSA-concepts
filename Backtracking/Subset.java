package Backtracking;

import java.util.Scanner;

public class Subset {
    public static void findSubsets(String str,String ans,int i){
        //base cas
        if(i==str.length()){
            if(ans.length()==0){
                System.out.println("null");
            }else{
                System.out.println(ans);
            }
            return;
        }
        //recursion include
        findSubsets(str,ans+str.charAt(i),i+1);
        //not include
        findSubsets(str,ans,i+1);
        //backtracking


    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        findSubsets(s,"",0);

        
    }
    
}
