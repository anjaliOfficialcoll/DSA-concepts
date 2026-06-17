// Input THIS IS ONLY FOR BST TREES NOT BINARY TREE;
// 50
// 30
// 70
// 20
// 40
// 60
// 80
// -1
// Output
// 20 30 40 50 60 70 80
package BTIn;

import java.util.Scanner;

public class Inorder{
    static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        public TreeNode(int val){
            this.val=val;
            this.left=null;
            this.right=null;
        }


    }
    public static TreeNode createBT(TreeNode root,int data){
        if(root==null){
            return new TreeNode(data);
        }

        if(data<root.val){
            root.left=createBT(root.left,data);
        }
        else  if(data>root.val){
            root.right=createBT(root.right,data);
        }
        return root;

    }
    public static void inorder(TreeNode root){
        if(root==null){
            return;
        }
        inorder(root.left);
        System.out.print(root.val+" ");
        inorder(root.right);

    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        TreeNode root=null;
        while(sc.hasNext()){
            int data=sc.nextInt();
            if(data==-1){
             break;
        }
            root=createBT(root,data);
        }
        inorder(root);
        sc.close();
    }
}