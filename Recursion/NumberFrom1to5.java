<<<<<<< HEAD
import java.util.*;

public class NumberFrom1to5{
    public static void printNum(int n){
        if(n == 0){
            return;
        }
        System.out.println(n);
        printNum(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the last Number:");
        int n = sc.nextInt();
        printNum(n);


        sc.close();

    }
=======
import java.util.*;

public class NumberFrom1to5{
    public static void printNum(int n){
        if(n == 0){
            return;
        }
        System.out.println(n);
        printNum(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the last Number:");
        int n = sc.nextInt();
        printNum(n);


        sc.close();

    }
>>>>>>> 3d252e668d782d679b3f6ca29f7ef2456389e2cb
}