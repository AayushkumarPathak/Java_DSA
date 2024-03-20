import java.util.*;
public class Ques8{
    public static int power(int x,int n){
        int result = 1;
        for(int i=0;i<n;i++){
            result = result*x;
        }
        // result = result*x;
        return result;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter x:");
        int x = sc.nextInt();
        System.out.println("Enter n:");
        int n = sc.nextInt();
        int p = power(x,n);
        System.out.println("The power of x**n is:"+p);
        //      !!!!!!!!!    
        //Please see that n is not too large or else result will exceed the size
        
    }
}