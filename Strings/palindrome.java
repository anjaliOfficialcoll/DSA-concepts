package Strings;

import java.util.Scanner;

public class palindrome {

    public static boolean checkPalindrome(String s){
        int n=s.length();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!=s.charAt(n-1-i)){
                  return false;
            }
        }
        return true;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();

        System.out.print(checkPalindrome(s));
        sc.close();

        
    }
    
}
