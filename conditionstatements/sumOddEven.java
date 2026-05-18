package conditionstatements;

import java.util.Scanner;

public class sumOddEven {
    public static void main(String args[]){
        int odd=0;int even=0;
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            if(i%2==0){
                even+=i;
            }else{
                odd+=i;
            }
        }
        System.out.println(even+" "+odd);
    }
    
}
