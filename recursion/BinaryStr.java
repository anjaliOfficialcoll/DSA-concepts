package recursion;

public class BinaryStr {
    public static void main(String[] args) {
        int n=3;
        binaryStirng(n,0,"");
    }

    private static void binaryStirng(int n, int i, String string) {
        if(n==0){
            System.out.println(string);
            return ;

        }

        binaryStirng(n-1,0,string+"0");
        if(i==0){
           binaryStirng(n-1,1,string+"1"); 
        }
    }
    
}
