package Strings;

import java.util.Scanner;

public class que1 {
    public static int countLC(String s){
        int count=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);

            if(Character.isLowerCase(ch)){
                count++;
            }
        }
        return count;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        System.out.println(countLC(s));
        String str="ApnaCollege".replace("l","");
        System.out.println(str);
        sc.close();
        

    }
    
}
