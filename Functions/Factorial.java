<<<<<<< HEAD
import java.util.Scanner;

public class Factorial {
    public static int fact(int n){
        int f = 1;
        for (int i=1;i<=n;i++){
            f = f*i;
        }
        return f;
        
        
        
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = sc.nextInt();
       System.out.println(fact(n));
       sc.close();
    }
}
=======
import java.util.Scanner;

public class Factorial {
    public static int fact(int n){
        int f = 1;
        for (int i=1;i<=n;i++){
            f = f*i;
        }
        return f;
        
        
        
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = sc.nextInt();
       System.out.println(fact(n));
    }
}
>>>>>>> 3d252e668d782d679b3f6ca29f7ef2456389e2cb
