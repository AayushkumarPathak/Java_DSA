import java.util.*;
public class string1{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        // string decleration
        String name = "Tony Stark";
        String sent = "My name is tony stark";
        System.out.println(name);
        System.out.println(sent);

        // input from user
        System.out.println("Enter the first name:");
        String fname = sc.nextLine();

        System.out.println("Enter the Last name:");
        String lname = sc.nextLine();

        System.out.println(fname);
        System.out.println(lname);

        System.out.println("Enter the senetence:");
        String myself10 = sc.nextLine();

        System.out.println(myself10);
    }

}