import java.util.*;
public class arrayQ2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length:");
        int n = sc.nextInt();
        int arr[] = new int[n];

        for(int i=0;i<arr.length;i++){
            System.out.println("Enter the element:");
            arr[i] = sc.nextInt();

        }
        System.out.println("Enter the element to find:");
        int inArr = sc.nextInt();
        for(int j=0;j<arr.length-1;j++){
            if(arr[j]==inArr){
                System.out.println("Element found in array");
            }
            else{
                System.out.println("Element not found:");
            }
        }
        sc.close();

    }
}