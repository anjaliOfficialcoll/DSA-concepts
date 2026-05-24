package recursion;

public class FirstOccur {
    public static void main(String[] args) {
        int arr[]={1,2,3,1,2,5,6,7};
        int i=arr.length;
        int key=1;

        System.out.println(firstOccur(arr,0,key));
        System.out.println(lastOccur(arr,i-1,key));
    }

    private static int firstOccur(int[] arr,int i,int key) {
        if(i==arr.length){
            return -1;
        }
        if(arr[i]==key){
            return i;
        }
        return firstOccur(arr,i+1,key);

        
    }
    
      private static int lastOccur(int[] arr,int i,int key) {
        if(i<0){
            return -1;
        }
        if(arr[i]==key){
            return i;
        }
        return lastOccur(arr,i-1,key);

        
    }
}
