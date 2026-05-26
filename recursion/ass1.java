package recursion;
// Sample Input: arr[ ] = {3, 2, 4, 5, 6, 2, 7, 2, 2},key = 2Sample Output: 1 5 7 8
public class ass1 {
    public static void main(String[] args) {
        int arr[]={3,2,4,5,6,2,7,2,2};
        int key=2;
        printInd(arr,key,0);
        
    }

    private static void printInd(int[] arr, int key,int i) {
        //base case
        if(i==arr.length){
            return;
        }
        //kaam

        if(arr[i]==key){
            System.out.print(i+" ");
        }
        //recursively call
        printInd(arr,key,i+1);

        
    }
    
}
