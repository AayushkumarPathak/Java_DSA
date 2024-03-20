import java.util.Scanner;

public class PassFail {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the total marks:");
        int marks = sc.nextInt();
        if(marks>=33){
            System.out.println("Promoted to next Session.");
        } else  {
            System.out.println("Re-appear in exam for promotion to next session.");

        }
    }
}
