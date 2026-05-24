package recursion;

import java.util.Scanner;

public class Fibonacci {

      private static int fibSeries(int x) {
        if (x == 1) {
            return 0; // 1st term
        }
        if (x == 2) {
            return 1; // 2nd term
        }
        return fibSeries(x - 1) + fibSeries(x - 2); // 3rd term and beyond
       

        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        System.out.println(fibSeries(x));
        sc.close();
    }

  
    
}
