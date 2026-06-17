package BinaryTree;

import java.util.Queue;
import java.util.LinkedList;

public class BTcreate {
    static class Node{
    int data;
    Node left;
    Node right;
    public Node(int data){
        this.data=data;
        this.left=null;
        this.right=null;

    }
    }
     static class CreateBt{
        static  int idx=-1;
        public static Node createBT(int nodes[]){
            idx++;
            if(nodes[idx]==-1){
                return null;
            }
            Node newNode=new Node(nodes[idx]);
            newNode.left=createBT(nodes);
            newNode.right=createBT(nodes);

            return newNode;

        }
        

    }
    //PREORDER TRAVERSAL
    public static void preorder(Node root){
        if(root==null){
            return ;
        }
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }
    //INORDER TRAVERSAL
    public static void ineorder(Node root){
        if(root==null){
            return ;
        }
        ineorder(root.left);
        System.out.print(root.data+" ");
        ineorder(root.right);
    }
    //POSTORDER TRAVERSAL
     public static void postorder(Node root){
        if(root==null){
            return ;
        }
        postorder(root.left);
        
        postorder(root.right);
        System.out.print(root.data+" ");
    }
    //LEVELORDER
    public static void levelOrder(Node root){
        if(root==null){
            return;
        }
         Queue<Node> q=new LinkedList<>();
         q.add(root);
         q.add(null);
         while(!q.isEmpty()){
            Node currNode =q.remove();
            if(currNode==null){
                System.out.println();
                if(q.isEmpty()){
                    break;
                }else{
                    q.add(null);
                }
            }else{
                System.out.print(currNode.data+" ");
                if(currNode.left!=null){
                    q.add(currNode.left);
                }
                if(currNode.right!=null){
                    q.add(currNode.right);
                }
            }

         }

    }

     
    
    public static void main(String args[]){
        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        CreateBt tree=new CreateBt();
        Node root=tree.createBT(nodes);
        // System.out.println(root.data);
        // preorder(root);
        // System.out.println();
        // ineorder(root);
        // System.out.println();
        // postorder(root);
        levelOrder(root);
    }
    
}

