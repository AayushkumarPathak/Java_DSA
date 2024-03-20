import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

class Reservation{
    HashSet<Integer> Confseat = new HashSet<>();
    ArrayList<Integer> farelist = new ArrayList<>();
        
   
    Scanner sc = new Scanner(System.in);

    String Name;
    String age;
    String contact;
    String gender;
    String Jdate;
    String from;
    String upto;
    String boarding;
    String ClassCoach;

    public void getData(){
        System.out.print("Enter Your Name: ");
        Name = sc.nextLine();

        System.out.print("Enter Age: ");
        age = sc.nextLine();

        System.out.print("Enter Contact: ");
        contact = sc.nextLine();
        System.out.print("Enter Gender: ");
        gender = sc.next();

        System.out.print("Enter Joruney Date DD-MM-YY : ");
        Jdate = sc.nextLine();

        System.out.print("Enter From Station: ");
        from = sc.nextLine();

        System.out.print("Enter Upto Station: ");
        upto = sc.nextLine();

        System.out.print("Enter Boarding Station: ");
        boarding = sc.nextLine();

        System.out.print("Enter Class to Travel: ");
        ClassCoach = sc.nextLine();
    }
// Considering that seats are available in First Turn
    public void allocateSeat(){
        System.out.print("Enter your fare to pay at Gateway");
        int x = sc.nextInt();
        System.out.print("Pay the Fare "+x+" : ");
        int fare = sc.nextInt();
        farelist.add(fare);

        int i=0;
        i++;

        if(!Confseat.contains(i)){
            Confseat.add(i);

        }
        else{
            System.out.println("Seat not Available");
            return;

        }

    }


   

}
public class HSApplications {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Reservation pr = new Reservation();
        System.out.print("1.Reservation\n2.Exit\nEnter Your choice: ");
        int ch = sc.nextInt();
        while(true){
            if(ch==1){
            pr.getData();
            pr.allocateSeat();
            }
            else if(ch==2){
            break;
            }
        }
        


        
    }
    
}
