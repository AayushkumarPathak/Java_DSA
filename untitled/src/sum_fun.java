import java.util.Scanner;

public class sum_fun {
    public static int Cal_sum(int a,int b){
        int sum = a+b;
        return sum;
    }
    public static void main(String args[]){
//        int a,b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a: ");
        int a = sc.nextInt();
        System.out.println("Enter the value of b:");
        int b = sc.nextInt();
        int sum = Cal_sum(a,b);
        System.out.println("The sum "+ a +" and "+ b +" is = "+sum);
        sc.close();
    }

}
