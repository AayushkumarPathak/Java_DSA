import java.util.Scanner;

public class Functions1 {
    public static int sum(int a,int b){
        return a+b;
    }

    public static int mul(int a,int b){
        return a*b;
    }

    public static int div(int a,int b){
        return a/b;
    }
    

    public static void main(String[] args) {
        int a,b;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();

        System.out.println("Add"+sum(a,b));
        System.out.println("Mul"+mul(a,b));
        System.out.println("Div"+div(a,b));
        System.out.println("Same or not..|true or false|: "+equal(a,b));

        System.out.println("exiting the program");
        sc.close();
    }

    public static boolean equal(int a,int b){
        return a==b;
    }
    
}
