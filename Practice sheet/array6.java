import java.util.*;
class array6{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter the element:");
            arr[i] = sc.nextInt();

        }
        for(int j=0;j<arr.length-1;j++){
            if(arr[j]>arr[j+1]){
                System.out.println("The largest element is:"+arr[j]);
            }
            else{
                System.out.println("Error");
            }
        }
        sc.close();
    }
}