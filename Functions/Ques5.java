<<<<<<< HEAD
import java.util.*;

public class Ques5{
    public static void vote(int age){
        if (age>=18){
            System.out.println("Eligible for voting");
        }else{
            System.out.println("Not Eligible for voting");
        }
        return;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age:");
        int age = sc.nextInt();
        vote(age);
        sc.close();
    }
=======
import java.util.*;

public class Ques5{
    public static void vote(int age){
        if (age>=18){
            System.out.println("Eligible for voting");
        }else{
            System.out.println("Not Eligible for voting");
        }
        return;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age:");
        int age = sc.nextInt();
        vote(age);
    }
>>>>>>> 3d252e668d782d679b3f6ca29f7ef2456389e2cb
}