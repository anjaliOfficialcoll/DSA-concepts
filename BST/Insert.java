package BST;

import java.util.Scanner;

import org.w3c.dom.Node;

public class Insert {

    static class TreeNode{
        int data;
        TreeNode left;
        TreeNode right;
        TreeNode(int data){
            this.data=data;
            left=right=null;

        }

    }
  
    public static TreeNode insert(TreeNode root,int val){
        if(root==null){
            root=new TreeNode(val);
            return root;
        }
        if(val<root.data){
            root.left=insert(root.left,val);
        }
        else if(val>root.data){
            root.right=insert(root.right,val);
        }
        return root;
    }
    public static void inorder(TreeNode root){
        if(root==null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);

    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int arr[]=new int[n];
        TreeNode root=null;
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            root=insert(root,arr[i]);
        }
        inorder(root);

    }
    
}
