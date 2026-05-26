package recursion;

public class TilingPrb {
    public static int tilingPrb(int n){
        //base case
        if(n==1 || n==0){
            return 1;
        }
        //kaam
        int vertTil=tilingPrb(n-1);
        int horTil=tilingPrb(n-2);
        int tot=vertTil+horTil;
        return tot;
    }
    public static void main(String args[]){
        //2*n
        int n=4;
        System.out.println(tilingPrb(n));
    }
    
}
