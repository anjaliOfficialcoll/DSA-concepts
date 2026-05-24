package recursion;

public class IsArrSor {
    public static boolean isArraySorted(int [] arr,int i){
        if(i==arr.length-1){
            return true;
        }
        if(arr[i]>arr[i+1]){
            return false;
        }
        return isArraySorted(arr,i+1);
    }
    public static void main(String[] args) {
        int []arr={1,2,3,4,6,2};
        int i=0;
        System.out.print(isArraySorted(arr,i));

    }
    
}
