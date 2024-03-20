import java.util.*;
class sumofdigits{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = sc.nextInt();
        int sum=0;
        int i=0;
        while(i>0){
            n=n%10;
            sum=sum+n;
            i++;
        }///errorr
        System.out.println(sum);
    }
}