public class FirstAndLastOcc{
    public static int firstOcc(int[] arr, int n,int key){
        int st = 0;
        int end = arr.length-1;
        
        int ans = -1;

        while(st<=end){
            int mid = st + (end-st)/2;
            if(arr[mid] == key){
                ans = mid;
                end = mid - 1;
            }
            if(arr[mid]<key){
                st = mid + 1;
            }
            else if(arr[mid]>key){
                end = mid - 1;
            }
        }
        return ans;
    }
    public static int lastOcc(int arr[],int n,int key){
        int st = 0;
        int end = arr.length-1;
        int ans = -1;
        while(st<=end){
            int mid = st + (end-st)/2;
            if(arr[mid] == key){
                ans = mid;
                st = mid + 1;
            }
            if(arr[mid]<key){
                st = mid + 1;
            }
            else if(arr[mid]>key){
                end = mid - 1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        // int arr[] = {1,2,3,3,3,3,3,5};
        int arr[] = {1,5,2};
        int key = 2;

        System.out.println("Fist Occurance of 2 is: "+firstOcc(arr,arr.length,key));
        // System.out.println("Fist Occurance of 3 is: "+lastOcc(arr,arr.length,key));
        // int totalNoOfOcc = (lastOcc(arr, key, key) - firstOcc(arr, key, key)+1);
        // System.out.println("Total number of Occurance of 3 is: "+totalNoOfOcc);
    }
}