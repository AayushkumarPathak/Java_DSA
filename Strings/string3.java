import java.util.*;
public class string3{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
         System.out.println("Enter the first name:");
         String fname = sc.nextLine();

         System.out.println("Enter the Second name:");
         String lname = sc.nextLine();

         String finalName = fname+" "+lname;
         System.out.println("Length of fullName:"+ finalName.length());

         //charAt
         for(int i=1;i<finalName.length();i++){
            System.out.println(finalName.charAt(i));

         }

    }
}
