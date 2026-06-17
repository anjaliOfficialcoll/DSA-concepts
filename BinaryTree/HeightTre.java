package BinaryTree;

public class HeightTre {
   static class TreeNode{
        int data;
        TreeNode left;
        TreeNode right;
        public TreeNode(int data){
            this.data=data;
            this.left=null;
            this.right=null;

        }

    }
    public static int heightOfTree(TreeNode root){
        if(root==null){
            return 0;
        }
        int lh=heightOfTree(root.left);
        int rh=heightOfTree(root.right);
        return Math.max(lh,rh)+1;
    }
    public static int nodesOfTree(TreeNode root){
        if(root==null){
            return 0;
        }
        int lh=nodesOfTree(root.left);
        int rh=nodesOfTree(root.right);
        return lh+rh+1;
    }
    //SUM OF TREE
    public static int sumOfTree(TreeNode root){
        if(root==null){
            return 0;
        }
        int lsum=sumOfTree(root.left);
        int rsum=sumOfTree(root.right);
        return lsum+rsum+root.data;
    }
    public static void main(String args[]){
       
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right=new TreeNode(3);
        root.left.left=new TreeNode(4);
        root.left.right=new TreeNode(5);
        root.right.left=new TreeNode(6);
        root.right.right=new TreeNode(7);
        System.out.println(heightOfTree(root));
        System.out.println(nodesOfTree(root));
        System.out.println(sumOfTree(root));

    }
    
}
