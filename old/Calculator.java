import java.util.*;
public class Calculator {
    
    public static int add(int arr[],int n, int sum){
        for(int i=0;i<n;i++){
            sum = sum+arr[i];
            
    
        }
        return sum; 
    
    }
    public static int sub(int arr[], int n, int sub){
        for(int i=0;i<n;i++){
            sub = sub-arr[i];
        }
        return sub;
    }
    public static int mul(int arr[], int n, int mul){
        for(int i=0;i<n;i++){
            mul = mul*arr[i];
        }
        return mul;
 
    }
    public static int div(int arr[], int n, int div){
        for(int i=0;i<n;i++){
            div = div/arr[i];
        }
        return div;
 
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of variables you want to use:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        int ch;


        for(int i=0;i<n;i++){
            System.out.print("Enter number:");
            arr[i] = sc.nextInt();
        }
        while(ch<=5){
            System.out.println("1.Addition\n2.Substraction\n3.Multiplication\n4.Division\n5.Exit\nEnter Your Choice:");
            ch = sc.nextInt();
            switch(ch){
                case 1:
                add(arr, n, ch);
                break;
                case 2:
                sub(arr, n, ch);
                break;
                case 3:
                mul(arr, n, ch);
                break;
                case 4:
                div(arr, n, ch);
                break;
                case 5:
                break;
                default:
                System.out.println("Please Enter Valid Choice:");
                break;
            }
            break;

        }
        
        // sc.close();
        
    }
    
}


