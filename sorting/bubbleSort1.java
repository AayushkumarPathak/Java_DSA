import java.util.*;
class bubbleSort1
{
    // function to print sorted array
    public static void printArray(int arr[]){
        System.out.println("Array In Sorted Order:");
        for(int k=0;k<arr.length;k++){
            System.out.print(arr[k]+" ");
        }
        System.out.println();
    }
    // function to sort the array
    public static int Sorted(int arr[])
    {
         // bubble sort
    for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return 0;
    }
    // __main__
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of Array:");
        int l = sc.nextInt();
        int arr[] = new int[l];
        for(int a=0;a<arr.length;a++){
            System.out.println("Enter the elements of array:");
            arr[a] = sc.nextInt();    
        }
        Sorted(arr);
        printArray(arr);
    }
    // TIME COMPLEXITY O(n^2);

}