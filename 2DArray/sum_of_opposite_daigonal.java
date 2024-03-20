import java.util.*;
class sum_of_opposite_daigonal{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int row = sc.nextInt();
        System.out.println("Enter the number of columns:");
        int col = sc.nextInt();
        int sum = 0;
        // appliciable for sqaure matrix only
        int arr[][] = new int[row][col];

        for(int r=0;r<row;r++){
            for(int c=0;c<col;c++){
                System.out.print("Enter the element at"+"["+r+"]"+"["+c+"]: ");
                arr[r][c] = sc.nextInt();

            }
        }
        for(int r=0;r<row;r++){
            for(int c=0;c<col;c++){
                System.out.print(arr[r][c]+"  ");
            }
            System.out.println();
        }
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if((i+j)==(row-1)){
                    sum =sum+arr[i][j]; 
                }
            }
        }
        System.out.println("The sum of Opposite Daigonal Element of matrix is:"+sum);
    }
}