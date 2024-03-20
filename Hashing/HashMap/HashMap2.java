import java.util.HashMap;
import java.util.Set;
import java.util.Scanner;

public class HashMap2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        HashMap<String,Integer> data = new HashMap<>();
        System.out.print("Enter the Size: ");
        int n = sc.nextInt();
        sc.nextLine();
        for(int i=0;i<n;i++){
            System.out.print("Enter name:");
            String name = sc.nextLine();
            System.out.print("Enter roll: ");
            int roll = sc.nextInt();
            
            data.put(name, roll);
            sc.nextLine();
        }
        Set<String> keys = data.keySet();
        for(String i:keys){
            System.out.println("Name: "+i +", "+"Roll no: "+data.get(i));
        }

        sc.close();
        
    }
    
}
