public class MaximumSubarray{
    public static int Maxsubarray(int arr[]){
        int sum = 0;
        int maxVal = arr[0];

        //kadane algorithm
        for(int i=0;i<arr.length;i++){
            sum = sum + arr[i];
            maxVal = Math.max(maxVal,sum);
            if(sum<0){
                sum = 0;
                
            }
        }
        return maxVal;
    }
    public static void main(String[] args) {
        int arr[] = {-2,1,-3,4,-1,2,1,-5,4};
        int ans = Maxsubarray(arr);
        System.out.println("Maximum Subarray: " +ans);
        //Time complexity O(n)
        //Space complexity O(1)


    }
}