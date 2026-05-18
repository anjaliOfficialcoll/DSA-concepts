package Arrays;

import java.util.Scanner;

public class SearchSotedMat {

     public static boolean searchMatrix(int[][] matrix, int target) {
        
        int i=0;int endCol=matrix[0].length-1;
        while(i<matrix.length && endCol>=0){
            if(matrix[i][endCol]==target){
                return true;
            }
            else if(matrix[i][endCol]>target){
                endCol--;

            }
            else if(matrix[i][endCol]<target){
                i++;

            }
        }
        return false;

        
        
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int [][] matrix= {
            {1,2,3,21},
            {4,5,6,9},
            {7,8,9,78}

        };
        int target=9;
        System.out.println(searchMatrix(matrix, target));
        System.out.print(searchMatrix(matrix, 100));

    }
    
}
