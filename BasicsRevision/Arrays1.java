import java.util.*;
public class Arrays1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[100];

        int n;
        System.out.println("Enter the size: ");
        n = sc.nextInt();

        for(int i=0;i<n;i++){
            System.out.print("Enter the ele at "+i+": ");
            arr[i] = sc.nextInt();
        }

        System.out.println("Your array is: ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }

        System.out.print("\nArray after reversing: ");
        reverse(arr, n);
        printarr(arr,n);

        sc.close();
    }

    public static void reverse(int arr[],int n){
        int start = 0;
        int end = n-1;

        while(start<=end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }

    public static void printarr(int arr[],int n){
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
    
}
