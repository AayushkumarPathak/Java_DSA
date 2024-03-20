import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;
public class EmployeeHashMap {
    public static void writeData(HashMap<Integer,String> hm, Scanner sc){
        
        System.out.print("Enter the number of Employees: ");
        int n = sc.nextInt();
        
        for(int i=0;i<n;i++){
            System.out.print("Enter EmpId for("+(i+1)+") : ");
            int id = sc.nextInt();
            sc.nextLine();
            System.out.print("Enter Name for("+(i+1)+") : ");
            String name = sc.nextLine();
            hm.put(id, name);
           
        }

    }
    public static void showData(HashMap<Integer,String> hm){
        Set<Integer> keys = hm.keySet();
        for(int i:keys){
            System.out.println("EmpId: "+i+"\tName: "+hm.get(i));
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<Integer,String> hm = new HashMap<>();
        writeData(hm,sc); 
        showData(hm);

        sc.close();
    }
    
}
