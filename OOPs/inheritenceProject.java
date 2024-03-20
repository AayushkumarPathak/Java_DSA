/* BANKING MANAGEMENT SYSTEM IN JAVA */
import java.util.*;

class Bank{
    String name;
    String branch;
    int ifsc;
    public void printInfo(){
        System.out.println("\t\t\t\t\t---------------------------------\t");
        System.out.println("\t\t\t\t\t  Welcome to "+name+"\t");
        System.out.println("\t\t\t\t\t---------------------------------\t");
        System.out.println("\t\t\t\tBranch:\t "+branch+" \t");
        System.out.println("\t\t\t\t\t\tIFSC Code: "+ifsc+"\t");

    }
}
class Login extends Bank{
    public void login(String id, String pass){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter SBI_ID:");
        id = sc.nextLine();
        System.out.print("Enter Password:");

        pass = sc.nextLine();
        System.out.println("LoggedIn.\n !! Please Logout After Work !!");
        sc.close();
        
    }

}
// this moudle shows 1 user data for his/her savings account
class Savings extends Bank{
    public void info(){
        System.out.println("\t--Savings Account Customer Information--");
        System.out.println("Abhishek Singh");
        System.out.println("Account number:12214677");
        System.out.println("Balance: 2,87,655");
        return;

    }


}
class Current extends Bank{
    public void info(){
        System.out.println("\t--Current Account Customer Information--");
        System.out.println("Priyanshu Ranjan");
        System.out.println("Account number:12226154");
        System.out.println("Balance: 7,05,766");
        return;
    }

}
class Loan extends Bank{
    public void details(){
        System.out.println("Interest for Education Loan is generally is 8% .");
        System.out.println("Interest for Home Loan is generally is 12% .");
        System.out.println("Interest for Car  Loan is generally is 10% .");
        return;
    }

}
class Registration extends Bank{
    public void add(String name, int con, String addr){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter user name:");
        name = sc.nextLine();

        System.out.print("Enter user contact number:");
        con = sc.nextInt();

        System.out.print("Enter user address:");
        addr = sc.nextLine();

        sc.close();

    }
    public void confirm(){
        System.out.println("User Registration Successfull");
    }

}

// class employee extends Bank{

// }

public class inheritenceProject {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Login log = new Login(); //login object
        Savings sv = new Savings(); //savings object
        Current cr = new Current(); //current object
        Loan ln = new Loan(); //loan object
        Registration reg = new Registration(); //registration object

        /*---------------
            Fixed Part
         ----------------*/
        Bank obj = new Bank();
        obj.name = "State Bank Of India";
        obj.branch = "Harmu Housing Colony Ranchi Jharkhand";
        obj.ifsc = 63211;
        obj.printInfo();
        /*---------------
             Fixed Part
         ----------------*/
        
        while(true){
            System.out.print("\n1.Login\n2.Saving_Acc Department\n3.Current_Acc Department\n4.Loan Department\n5.Register_New_User\n6.Exit\nEnter Your Choice:");
            int ch = sc.nextInt();
            if(ch==1){
                log.login(null,null);

            }
            else if(ch==2){
                sv.info();

            }
            else if(ch==3){
                cr.info();
            }
            else if(ch==4){
                ln.details();
            }
            else if(ch==5){
                reg.add("Aayush",1222,"Ranchi");
                // reg.confirm();
            }
            else if(ch==6){
                break;
            }
            else{
                System.out.println("Error! Enter valid choice.");
                break;
            }
        }
            
        sc.close();
        
    }
    
}
