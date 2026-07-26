package BST;

import java.util.Scanner;

public class PrintRange {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
            left=right=null;

        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        
        Node root=null;
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            root=insert(root,arr[i]);
        }

        int left=sc.nextInt();
        int right=sc.nextInt();

        printRange(root,left,right);
        System.out.print(printRangeSum(root,left,right));

    }
    private static int printRangeSum(Node root, int left, int right) {
        if(root==null){
            return 0;
        }
        if(root.data<left){
            return printRangeSum(root.right, left,  right) ;

        }
        if(root.data>right){
            return printRangeSum(root.left, left,  right) ;

        }
        return root.data + printRangeSum(root.left, left, right) + printRangeSum(root.right,left, right) ;
        
    }
    private static void printRange(Node root, int left, int right) {
        if(root==null){
            return;
        }
        if(left<=root.data && right>=root.data){
            printRange(root.left,left,right);
            System.out.print(root.data+" ");
              printRange(root.right,left,right);
        }
        else if(root.data<left){
             printRange(root.right,left,right);
        }else if(root.data>right){
               printRange(root.left,left,right);
        }

     
    }
    private static Node insert(Node root, int val) {
        if(root==null){
            return new Node(val);
        }
        if(root.data >val){
            root.left=insert(root.left,val);

        }else if(root.data<val){
            root.right=insert(root.right,val);
        }
        return root;
        
    }

    
}
