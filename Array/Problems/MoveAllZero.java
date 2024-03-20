// import java.util.Scanner;

// public class MoveAllZero{
//     public static void moveZeors(int arr[],int idx,int count,int arr2[]){
//         //base case
//         if(idx == arr.length){
//             for(int i=0;i<count;i++){
//                 arr2[i] = 0;

//             }
//             for (int i : arr2) {
//                 System.out.print(i+" ");
                
                
//             }
//             return;
//         }
//         //
//         int curr = arr[idx];
//         if(curr == 0){
//             count++;
//             moveZeors(arr, idx+1, count, arr2);
//         }
//         else{
//             arr[idx] = arr2[idx];
//             moveZeors(arr, idx+1, count, arr2);

//         }
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter the n:");
//         int n = sc.nextInt();

//         int arr[] = new int[n];
        
//         //input
//         for(int i=0;i<n;i++){
//             arr[i] = sc.nextInt();
//         }
//         int arr2[] = new int[n];
//         int count = 0;
//         int idx = 0;
//         moveZeors(arr,idx,count,arr2);

//         sc.close();
//     }
// }

import java.util.Scanner;

public class MoveAllZero {
    public static void moveZeros(int arr[]) {
        int n = arr.length;
        int nonZeroIndex = 0;

        // Copy non-zero elements to the original array
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                arr[nonZeroIndex++] = arr[i];
            }
        }

        // Fill the remaining elements with zeros
        while (nonZeroIndex < n) {
            arr[nonZeroIndex++] = 0;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the n: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        // Input
        System.out.println("Enter the array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        moveZeros(arr);

        // Output
        System.out.println("Array after moving zeros to the end:");
        for (int i : arr) {
            System.out.print(i + " ");
        }

        sc.close();
    }
}
