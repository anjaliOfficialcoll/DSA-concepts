package BST;

import java.util.*;
//)(Height)
class Search{
    static class TreeNode{
        int data;
        TreeNode left;
        TreeNode right;
        TreeNode(int data){
            this.data=data;
            left=right=null;
        }
    }
    public static boolean search(TreeNode root,int key){
        if(root==null){
            return false;
        }
        if(root.data==key){
            return true;
        }
        if(key<root.data){
            return search(root.left,key);

        }else{
            return search(root.right,key);
        }
        
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        TreeNode root=null;
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            root=insert(root,arr[i]);
        }
        int key=sc.nextInt();
        if(search(root,key)){
            System.out.print("found");

        }else{
            System.out.print("not found");
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
        if(val>root.data){
            root.right=insert(root.right,val);
        }
        return root;


        

    }
}
