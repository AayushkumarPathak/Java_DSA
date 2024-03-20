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
