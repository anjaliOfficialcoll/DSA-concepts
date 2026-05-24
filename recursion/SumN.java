package recursion;

public class SumN {

    public static int sumN(int n) {
        if(n==1){
            return 1;
        }
        int sum=0;
        sum+= n + sumN(n-1);
        return sum;

        
    }
    public static void main(String[] args) {
        int n=5;
        int res=sumN( n);
        System.out.println(res);
    }
    
}
