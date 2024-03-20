import java.util.Scanner;

public class FunctionAndMethods {
    public static void myname(String name){
        System.out.println(name);
        return;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name:");
        String name  = sc.next();
        //call the above function -
        myname(name);
        sc.close();
    }
}
