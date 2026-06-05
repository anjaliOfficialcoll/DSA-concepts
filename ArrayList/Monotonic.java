package ArrayList;

public class Monotonic {
    public  static void main(String args[]){
        int arr[]={1,2,3,4};
        System.out.println(isMonotonic(arr));

    }

    public static boolean isMonotonic(int[] nums) {
        boolean inc=true;
        boolean dec=true;

        for(int i=0;i<nums.length-1;i++){
            if(nums[i]>nums[i+1]){
                inc=false;
            }
            if(nums[i]<nums[i+1]){
                dec=false;
            }
            
        }
        return inc || dec;
        
    }
    
}
