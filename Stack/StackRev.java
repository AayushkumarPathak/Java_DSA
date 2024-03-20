import java.util.*;
public class StackRev {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size");
        int n = sc.nextInt();

        for(int i=0;i<n;i++){
            System.out.print("Enter ele");
            int ele = sc.nextInt();
            s.push(ele);
        }
        System.out.println("Stack elements are: ");
        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }

        sc.close();
    }
    
}
