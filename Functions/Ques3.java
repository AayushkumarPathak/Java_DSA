<<<<<<< HEAD
import java.util.*;

public class Ques3{
    public static int check(int a,int b){
        if (a>b){
            return a;
        }else{
            return b;
        }
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number a:");
        int a = sc.nextInt();
        System.out.println("Enter the number b");
        int b = sc.nextInt();

        System.out.println("The Greatest number is: "+check(a,b));
        sc.close();
    }
=======
import java.util.*;

public class Ques3{
    public static int check(int a,int b){
        if (a>b){
            return a;
        }else{
            return b;
        }
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number a:");
        int a = sc.nextInt();
        System.out.println("Enter the number b");
        int b = sc.nextInt();

        System.out.println("The Greatest number is: "+check(a,b));

    }
>>>>>>> 3d252e668d782d679b3f6ca29f7ef2456389e2cb
}