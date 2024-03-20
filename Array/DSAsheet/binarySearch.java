import java.util.Scanner;

public class binarySearch {

    public static void BinarySearch(int arr[], int n,int val){
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-1-i;j++){
                int temp = arr[j];
                if(arr[j]>arr[j+1]){
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        int low = 0;
        int high = n-1;
        int mid;
        // int idx = -1;

        while(low<=high){
           mid = (low+high)/2;
           if(val == arr[mid]){
            System.out.println("found at: "+mid);
            break;
           }
           else if(val < arr[mid]){
            high = mid-1;
          

           }
           else{
            low = mid+1;
            
           }
           
        }
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array:");
        int n = sc.nextInt();

        int arr[] = new int[n];

        for(int i=0;i<n;i++){
            System.out.print("Enter the element:");
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the element to search:");
        int val = sc.nextInt();

        BinarySearch(arr, n, val);

        sc.close();

    }
}
