package recursion;

public class ass3 {
    public static void main(String[] args) {
        String str="anjalikumari";
        System.out.println(findLen(str,0,0));
    }

    private static int findLen(String str,int i,int len) {
       if(i==str.length()){
           return len;
       }
       return findLen(str,i+1,len+1);
    }
    
}
