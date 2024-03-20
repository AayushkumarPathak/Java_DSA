import java.util.*;
public class string2{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        // concatenation
        System.out.println("Enter the 1st:");
        String a = sc.nextLine();
        System.out.println("Enter the 2nd:");
        String b = sc.nextLine();

        String con = a+" "+b;
        System.out.println(con);

        //length of string

        System.out.println("The length of new string is:"+con.length());

    }
}