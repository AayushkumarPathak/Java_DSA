<<<<<<< HEAD
import java.util.Scanner;

public class EvenByFunction {
    public static void check(int num){
        if (num%2==0){
            System.out.println("Even Number");
        }
        else{
            System.out.println("Odd Number");
        }
    }
    // __main__
    public  static  void main(String args[]){
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = sc.nextInt();

        check(num);
        sc.close();


    }
}
=======
import java.util.Scanner;

public class EvenByFunction {
    public static void check(int num){
        if (num%2==0){
            System.out.println("Even Number");
        }
        else{
            System.out.println("Odd Number");
        }
    }
    // __main__
    public  static  void main(String args[]){
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = sc.nextInt();

        check(num);


    }
}
>>>>>>> 3d252e668d782d679b3f6ca29f7ef2456389e2cb
