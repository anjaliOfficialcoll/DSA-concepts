package recursion;

public class Power {

    private static int power(int n, int pow) {
        if(pow==1){
            return n;
        }
        return n*power(n,pow-1);
        
    }
    private static int optimizedpower(int n, int pow) {
        if(pow==0){
            return 1;
        }
        int halfPower=optimizedpower(n,pow/2);
        
       int res=halfPower*halfPower;
       if(pow%2!=0){
       res=n*res;
       }
       return res;

        
    }
    public static void main(String[] args) {
        int n=2;
        int pow=5;
        System.out.print(optimizedpower(n,pow));
    }

    
    
}
