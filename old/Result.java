import java.util.Scanner;
// Error;;;Error;;;Error
public class Result {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N =300;
        float per;
        System.out.println("Enter the marks of maths");
        int maths = sc.nextInt();
        System.out.println("Enter the marks of chemistry");
        int chem = sc.nextInt();
        System.out.println("Enter the marks of physics");
        int phy = sc.nextInt();
        int total = (maths+chem+phy);
        System.out.println("The total Marks is : ");
        System.out.println(total);
        per  = (total/N);
        System.out.println("Your Percenteage% is : ");
        System.out.println(per);
        if(total>=99){
            System.out.println("Promoted to next Session");
        }else{
            System.out.println("Failed Please reappear in the examination ): ");
        }
        sc.close();
    }

}

