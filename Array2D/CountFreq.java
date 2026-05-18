package Array2D;

public class CountFreq {

    public static int countF(int arr[][],int target){
        int count=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(arr[i][j]==target){
                    count++;

                }
            }

        }
        return count;

    }
    public static int rowSum(int arr[][]){
        int sum=0;
        for(int i=0;i<arr[0].length;i++){
            sum+=arr[1][i];
        }
        return sum;

    }
    public static void main(String args[]){
        int arr[][]={{4,7,8},{8,8,7}};
        int target=8;
        int arr2[][]= {{1,4,9},{11,4,3},{2,2,3} };
        System.out.println(countF(arr,target));
        System.out.print(rowSum(arr2));


    }
    
}
