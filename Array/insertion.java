import java.util.*;
public class insertion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length:");
        int n = sc.nextInt();
        int arr[] = new int[n];

        for(int i=0;i<n;i++){
            System.out.print("Enter the element:");
            arr[i] = sc.nextInt();

        }
        System.out.print("Enter the position:");
        int pos = sc.nextInt();

        System.out.print("Enter the element to insert:");
        int x = sc.nextInt();

        for(int j=n-2;j>=pos-2;j--){
            arr[j+1] = arr[j];
        }

        arr[pos-1] = x;
        System.out.println("Updated array:");
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
        sc.close();

    }

    
}
