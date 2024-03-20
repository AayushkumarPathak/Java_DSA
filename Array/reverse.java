<<<<<<< HEAD
import java.util.*;

class reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int n =sc.nextInt();
        // int arr[] =int new[n];
        int arr[] = { 1, 2, 3, 4 };

        // for(int i=0;i<arr.length;i++){
        // for(int j=0;j<arr.length-1-i;j++){
        // int temp = arr[j];
        // arr[j]=arr[j+1];
        // arr[j+1]=temp;
        // System.out.println(j);

        // }
        // }
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.println(arr[i]);
        }
        sc.close();

    }
=======
import java.util.*;
class reverse{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // int n =sc.nextInt();
        // int arr[] =int new[n];
        int arr[] = {1,2,3,4};
        
        // for(int i=0;i<arr.length;i++){
        //     for(int j=0;j<arr.length-1-i;j++){
        //         int temp = arr[j];
        //         arr[j]=arr[j+1];
        //         arr[j+1]=temp;
        //         System.out.println(j);

        //     }
        // }
        for(int i=arr.length-1;i>=0;i++){
            System.out.println(arr[i]);
        }
        
    }
>>>>>>> 3d252e668d782d679b3f6ca29f7ef2456389e2cb
}