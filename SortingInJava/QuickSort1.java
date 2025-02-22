// public class QuickSort1 {
//     public static int partition(int arr[],int low,int high){
//         int pivot = arr[high];
//         int i = low-1;

//         for(int j=low;j<high;j++){
//             if(arr[j]<pivot){
//                 i++;
//                 //swap
//                 int temp = arr[i];
//                 arr[i] = arr[j];
//                 arr[j] = temp;
//             }
//         }
//         i++;
//         int temp = arr[i];
//         arr[i] = arr[pivot];
//         arr[high] = temp;

//         return i;
//     }
//     public static void quickSort(int arr[],int low,int high){
//         if(low<high){
//             int pidx = partition(arr,low,high);

//             quickSort(arr, low, pidx-1);
//             quickSort(arr, pidx+1, high);
//         }
//     }
//     public static void main(String[] args) {
//         int arr[] = {6,3,9,5,2,8};
//         int n = arr.length;

//         quickSort(arr, 0, n-1);

//         for(int i=0;i<n;i++){
//             System.out.print(arr[i]+" ");
//         }
//     }
    
// }
public class QuickSort1 {
    public static int partition(int arr[], int low, int high) {
        int pivot = arr[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                // Swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        i++;
        // Swap the pivot element with arr[i]
        int temp = arr[i];
        arr[i] = arr[high];
        arr[high] = temp;

        return i;
    }

    public static void quickSort(int arr[], int low, int high) {
        if (low < high) {
            int pidx = partition(arr, low, high);

            quickSort(arr, low, pidx - 1);
            quickSort(arr, pidx + 1, high);
        }
    }

    public static void main(String[] args) {
        int arr[] = {6, 3, 9, 5, 2, 8};
        int n = arr.length; // Use arr.length

        quickSort(arr, 0, n - 1); // Adjust the range to [0, n - 1]

        for (int i = 0; i < n; i++) { // Use < instead of <= for the loop condition
            System.out.print(arr[i] + " "); // Use print to avoid extra spaces between elements
        }
    }
}
