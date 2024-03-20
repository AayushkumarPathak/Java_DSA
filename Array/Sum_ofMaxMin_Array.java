<<<<<<< HEAD
import java.util.*;
public class Sum_ofMaxMin_Array{
    // __function to find sum of max && min value in an array__

    public static int Sum_ofMaxmin(int A[]){
        
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int j=0;j<A.length;j++){
            if(A[j]<min){
                min = A[j];

            }
            if(A[j]>min){
                max = A[j];
            }  
        }
        return max+min;
        // __main__
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array:");
        int n = sc.nextInt();
        int A[] = new int[n];

        for(int i=0;i<n;i++){
            System.out.println("Enter the element:");
            A[i] = sc.nextInt();
        }
        System.out.println("The sum of Max and min element is:"+Sum_ofMaxmin(A));
        sc.close();
    }
=======
import java.util.*;
public class Sum_ofMaxMin_Array{
    // __function to find sum of max && min value in an array__

    public static int Sum_ofMaxmin(int A[]){
        
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int j=0;j<A.length;j++){
            if(A[j]<min){
                min = A[j];

            }
            if(A[j]>min){
                max = A[j];
            }  
        }
        return max+min;
        // __main__
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array:");
        int n = sc.nextInt();
        int A[] = new int[n];

        for(int i=0;i<n;i++){
            System.out.println("Enter the element:");
            A[i] = sc.nextInt();
        }
        System.out.println("The sum of Max and min element is:"+Sum_ofMaxmin(A));

    }
>>>>>>> 3d252e668d782d679b3f6ca29f7ef2456389e2cb
}