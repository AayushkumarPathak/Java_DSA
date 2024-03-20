import java.util.*;

public class lessOrGreater
{
    public  static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a:");
        int a = sc.nextInt();
        System.out.println("Enter the value of b:");
        int b = sc.nextInt();

        if (a==b){
            System.out.println("Equal");
        } else{
            if(a>b){
                System.out.println("a is greater than all");
            }else{
                if(a<b){
                    System.out.println("b is greater than all");
                }
            }

        }
        sc.close();
    }
}
