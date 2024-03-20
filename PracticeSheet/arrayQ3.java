import java.util.*;
public class arrayQ3{
    // sum of all element && average of each element
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of array:");
        int n = sc.nextInt();
        int sum=0;
        int avg=0;

        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter the element:");
            arr[i] = sc.nextInt();

        }
        // for each loop
        for(int element:arr){
            sum=sum+element;

        }

        avg = sum/n;

        System.out.println("The sum of each element is:"+sum);
        System.out.println("The Average of all element is:"+avg);
    }
}