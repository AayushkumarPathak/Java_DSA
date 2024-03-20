<<<<<<< HEAD
import java.util.*;
public class array_MIN_MAX{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size:");
        int s = sc.nextInt();
        int arr[] = new int[s];

        for(int i=0;i<s;i++){
            System.out.println("Enter the element:");
            arr[i] = sc.nextInt();

        }
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min = arr[i];
            }
            if(arr[i]>max){
                max = arr[i];
            }
        }
        System.out.println("Largest number in array:"+max);
        System.out.println("Smallest number in array:"+min);
        sc.close();
    }
=======
import java.util.*;
public class array_MIN_MAX{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size:");
        int s = sc.nextInt();
        int arr[] = new int[s];

        for(int i=0;i<s;i++){
            System.out.println("Enter the element:");
            arr[i] = sc.nextInt();

        }
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min = arr[i];
            }
            if(arr[i]>max){
                max = arr[i];
            }
        }
        System.out.println("Largest number in array:"+max);
        System.out.println("Smallest number in array:"+min);

    }
>>>>>>> 3d252e668d782d679b3f6ca29f7ef2456389e2cb
}