package Backtracking;

public class Nqueen {
    public static boolean isSafe(char box[][],int row,int col){
        //check vertically
        for(int i= row-1;i>=0;i--){
            if(box[i][col]=='Q'){
                return false;
            }

        }
        //check left diagonal
        for(int i=row-1 ,j=col-1 ;i>=0 && j>=0;i--,j--){
              if(box[i][j]=='Q'){
                return false;
            }

        }
         //check right diagonal
        for(int i=row-1 ,j=col+1 ;i>=0 && j<box.length;i--,j++){
              if(box[i][j]=='Q'){
                return false;
            }

        }
        return true;

    }
    public static void nqueen(char [][] box, int row){
        //base case
        if(row==box.length){
            printBox(box);
            return ;
        }
        for(int i=0;i<box.length;i++){
            if(isSafe(box,row,i)){
                box[row][i]='Q';
                 nqueen(box,row+1);
            box[row][i]='x';

            }
            
           

        }

    }
   public static void printBox(char[][] box){
    System.out.println("-----Chess Board-----");

    for(int i=0;i<box.length;i++){
        for(int j=0;j<box.length;j++){
            System.out.print(box[i][j]+" ");
        }
        System.out.println();
    }

    System.out.println();
}
    public static void main(String args[]){
        int n=4;
        char mat[][]=new char[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                mat[i][j]='x';
            }
        }
        nqueen(mat,0);
        
    }
    
}
