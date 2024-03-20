<<<<<<< HEAD
import java.util.*;
// Sum of first n natural numbers using recursion    
public class rec3 {
    public static void printsum(int i,int n, int sum){
        if(i == n){
            sum +=i;
            System.out.println("The sum of first "+n+" natural numbers is: "+sum);
            return;
        }
        sum +=i;
        printsum(i+1,n,sum);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the nth number:");
        int n = sc.nextInt();
        int sum = 0;
        int i=1;
        printsum(i, n, sum);
        
        sc.close();
    }
    
}
=======
import java.util.*;
// Sum of first n natural numbers using recursion    
public class rec3 {
    public static void printsum(int i,int n, int sum){
        if(i == n){
            sum +=i;
            System.out.println("The sum of first "+n+" natural numbers is: "+sum);
            return;
        }
        sum +=i;
        printsum(i+1,n,sum);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the nth number:");
        int n = sc.nextInt();
        int sum = 0;
        int i=1;
        printsum(i, n, sum);
        
        sc.close();
    }
    
}
>>>>>>> 3d252e668d782d679b3f6ca29f7ef2456389e2cb
