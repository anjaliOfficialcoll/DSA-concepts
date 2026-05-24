package recursion;

public class Factorial {
    public static int fact(int n){
        if(n==0 ){
            return 1;
        }
        int res=fact(n-1)*n;

        return res;

    }
    public static void main(String args[]){
        int n=5;
        int res=fact(n);
        System.out.println(res);
    }
    
}
