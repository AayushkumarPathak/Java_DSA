<<<<<<< HEAD

public class checkSorted {
    public static boolean isSorted(int arr[], int idx){
        if(idx==arr.length-1){
            return true;
        }
        if(arr[idx] < arr[idx+1]){
            return isSorted(arr, idx+1);
        }
        else{
            return false;
        }
    
}
    public static void main(String[] args) {
        int arr[] = {1,2,3,4};
        System.out.println(isSorted(arr,0));
    }
    
}
=======

public class checkSorted {
    public static boolean isSorted(int arr[], int idx){
        if(idx==arr.length-1){
            return true;
        }
        if(arr[idx] < arr[idx+1]){
            return isSorted(arr, idx+1);
        }
        else{
            return false;
        }
    
}
    public static void main(String[] args) {
        int arr[] = {1,2,3,4};
        System.out.println(isSorted(arr,0));
    }
    
}
>>>>>>> 3d252e668d782d679b3f6ca29f7ef2456389e2cb
