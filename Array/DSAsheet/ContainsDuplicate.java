// package DSAsheet;

import java.util.Arrays;
public class ContainsDuplicate {
    public static boolean morethan(int arr[]){
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-1;j++){
                if(arr[j] == arr[j+1]){
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,3};
        System.out.println(morethan(arr));
        // Time complexity O(n)
        // Space compleity O(1)
       
    






        
    }
    
}
