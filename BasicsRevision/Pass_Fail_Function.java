import java.util.Scanner;

public class Pass_Fail_Function {

    public static void factorial(int n){
        int fact = 0;
        for(int i=1;i<=n;i++){
            fact=fact*i;

        }
        System.out.println("Fatcorial of "+n+"is:"+fact);


    }

    public static void main(String[] agrgs){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int n = sc.nextInt();
        factorial(n);

    }
}
