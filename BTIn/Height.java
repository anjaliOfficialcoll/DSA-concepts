package BTIn;
// For Level Order Input Tree Construction, the input:
// 7
// 1 2 3 4 5 6 7
// represents the tree:
//         1
//       /   \
//      2     3
//     / \   / \
//    4  5  6  7
// Height = 3
import java.util.Scanner;


public class Height {
    static class TreeNode{
        int data;
        TreeNode left;
        TreeNode right;
        public TreeNode(int data){
            this.data=data;
            this.left=this.right=null;

        }

    }
    public static TreeNode createTree(int arr[]){
        TreeNode root=new TreeNode(arr[0]);
        int i=1;int n=arr.length;
        while(i<n){
            if(i<n){
                root.left=new TreeNode(arr[i++]);

            }
            if(i<n){
                root.right=new TreeNode(arr[i++]);

            }
        }
        return root;

        
    }
    public static int heightOfTree(TreeNode root){
        if(root==null){
            return 0;
        }
        return Math.max(heightOfTree( root.left),heightOfTree( root.right));
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();int arr[]=new int[n];
        if(n==0){
            return ;
        }
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        TreeNode root=createTree(arr);
        System.out.println(heightOfTree(root));
        
    }
    
}
