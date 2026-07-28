package Backtracking;

public class GridWays {
    public static int gridWays(int r,int c,int i,int j){
        if(i==r-1 && j==c-1){
            return 1;
        }else if(i==r || j==c ){
            return 0;
        }

        int w1=gridWays(r,c,i+1,j);
        int w2=gridWays(r,c,i,j+1);
        return w1+w2;

    }
    public static void main(String args[]){
        int r=3;int c=3;
        System.out.print(gridWays(r,c,0,0));
    }
    
}
