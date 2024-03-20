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
}