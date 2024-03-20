
import java.util.*;
public  class sumof{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age:");
        int age = sc.nextInt();
        if (age>18){
            System.out.println("Allowed for voting");
        } else {
            System.out.println("Not allowed to vote");
        }
        sc.close();
    }
}