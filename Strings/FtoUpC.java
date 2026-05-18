package Strings;

import java.util.Scanner;

public class FtoUpC {
    public static String toUpperCase(String s){
        
        StringBuilder sb=new StringBuilder();
        sb.append(Character.toUpperCase(s.charAt(0)));
        for(int i=1;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch==' '){
                sb.append(ch);
                i++;
                sb.append(Character.toUpperCase(s.charAt(i)));
            }else{
                sb.append(ch);
            }
        }
        return sb.toString();

    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println(toUpperCase(s));

    }
    
}
