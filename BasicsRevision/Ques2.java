import java.util.*;
public class Ques2{
    public static int odd(int n){
        int sum = 0;
        for(int i =1;i<=n;i++){
            if (i%2!=0){
                sum=sum+i;
            }

        }
        return sum;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the n:");
        int n = sc.nextInt();
        System.out.println("The sum of odd number between 1 and "+n+" is: "+odd(n));
    }
}