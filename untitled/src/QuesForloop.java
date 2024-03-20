import java.util.*;
public class QuesForloop {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the terminating value");
        int count = sc.nextInt();
        for (int i  = 1;i<=count ;i++){
            System.out.println(i);
        }
        sc.close();

    }
}
