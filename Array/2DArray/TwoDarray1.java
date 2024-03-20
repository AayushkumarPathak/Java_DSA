import java.util.*;
public class TwoDarray1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of Rows:");
        int row = sc.nextInt();
        System.out.println("Enter no of Columns:");
        int col = sc.nextInt();

        int arr[][] = new int[row][col];
        
        for(int r=0;r<row;r++){
            for(int c=0;c<col;c++){
                System.out.println("Enter the element at"+"["+r+"]"+"["+c+"]: ");
                arr[r][c] = sc.nextInt();

            }
        }
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print(arr[i][j]+"  ");
            }
            System.out.println();
        }   //TIME COMPLEXITY O(n^2)
        sc.close();
    }
}