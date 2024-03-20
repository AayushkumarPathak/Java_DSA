import java.util.*;
public class Array2d{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int arr[][]= new int[3][3];
        for(int r=0;r<3;r++){
            for(int c=0;c<3;c++){
                System.out.println("Enter the element at" + "["+r+"]"+"["+c+"] :");
                arr[r][c] = sc.nextInt();
            }
        }
        // System.out.println("\n");
        for(int r=0;r<3;r++){
            for(int c=0;c<3;c++){
                System.out.print(arr[r][c]+" ");
            }
            System.out.println();
        }
        

    }

}