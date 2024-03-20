import java.util.*;
public class  Multiply_by2_Functions{

    public static int calculate(int num){
        int ans = 2*num;
        return ans;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        
        int num = sc.nextInt();
        int mul = calculate(num);
        
        System.out.println("The multiple is "+ mul);
        
    }

}