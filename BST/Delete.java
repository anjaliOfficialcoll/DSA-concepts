package BST;

import java.util.Scanner;

public class Delete {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
            left=right=null;
        }
    }
    public static Node delete(Node root,int del){
        if(root==null){
            return null;
        }
        if(del < root.data){
            root.left = delete(root.left, del);
        } else if(del > root.data){
            root.right = delete(root.right, del);
        } else {
            // no children
            if(root.left==null && root.right==null){
                return null;
            }
            // one child
            if(root.left==null){
                return root.right;
            } else if(root.right==null){
                return root.left;
            }
            // two children: replace with inorder successor (smallest in right subtree)
            Node IS = findInorderSuccessor(root.right);
            root.data = IS.data;
            root.right = delete(root.right, IS.data);


        }
        return root;
       

    }
     public static Node findInorderSuccessor(Node root){
            while(root.left!=null){
                root=root.left;
            }
            return root;

    }
    public static Node insert(Node root,int val){
        if(root==null){
            root=new Node(val);
            return root;
        }
        if(val < root.data){
            root.left = insert(root.left, val);
        } else if(val > root.data){
            root.right = insert(root.right, val);
        }
        return root;
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
        int del=sc.nextInt();
        Node node =delete(root,del);
        inorder(node);




    }
    public static void inorder(Node root){
        if(root==null){
            return ;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }
    
}
