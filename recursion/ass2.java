//Sample Input: 1947Sample Output: “one nine four seven
package recursion;

public class ass2 {
    public static void main(String[] args) {
        int n=1947;
        printWord(n);
    }

    private static void printWord(int n) {
        String[] digit={"zero" ,"one","two","three","four","five","six","seven","eight","nine"};
        //base case
        if(n==0){
            return;
        }
        int dig=n%10;
        n=n/10;
        
        printWord(n);
        System.out.print(digit[dig]+" ");
    }
    
}
