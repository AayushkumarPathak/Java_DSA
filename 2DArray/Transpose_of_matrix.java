import java.util.*;
public class Transpose_of_matrix{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();

        int matrix[][] = new int[row][col];
        int trans[][] = new int[col][row];

        for(int r=0;r<row;r++){
            for(int c=0;c<col;c++){
                System.out.println("Enter the element at"+"["+r+"]"+"["+c+"]: ");
                matrix[r][c] = sc.nextInt();
            }
        }

        for(int c=0;c<col;c++){
            for(int r=0;r<row;r++){
                trans[c][r] = matrix[r][c];
                System.out.print(matrix[r][c]+"  ");
            }
            System.out.println();
        }
        //TIME COMPLEXITY O(n^2)
    }
}