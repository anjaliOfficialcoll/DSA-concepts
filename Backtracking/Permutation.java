package Backtracking;

import java.util.Scanner;

public class Permutation {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        findPermutation(s,"");

        

    }
    public static void findPermutation(String str,String ans){
        if(str.length()==0){
            System.out.print(ans+" ");
            
        }
        //recursion
        for(int i=0;i<str.length();i++){
            char curr=str.charAt(i);
            String newStr=str.substring(0,i)+str.substring(i+1);
            findPermutation(newStr,ans+curr);
        }
    }
    
}
