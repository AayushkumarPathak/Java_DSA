import java.util.*;
public class findingIndices{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int row = sc.nextInt();
        System.out.println("Enter the number of columns:");
        int col = sc.nextInt();

        int arr[][] = new int[row][col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
            System.out.println("Enter the element at"+"["+i+"]"+"["+j+"]: ");
            arr[i][j] = sc.nextInt();

            }
        }
        int user = sc.nextInt();
        for(int r=0;r<row;r++){
            for(int c=0;c<col;c++){
                if(arr[r][c]==user){
                    System.out.println("Found at:"+"["+r+"]"+"["+c+"]");
                }
            }
        }
    }
}