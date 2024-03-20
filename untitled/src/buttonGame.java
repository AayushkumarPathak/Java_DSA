import java.util.Scanner;

public class buttonGame {
    public static  void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the button:");
        int button = sc.nextInt();
        if (button==1){
            System.out.println("Hello");
        } else if (button==2) {
            System.out.println("Namaste");
        }else if (button==3){
            System.out.println("Bonjoour");
        }else{
            System.out.println("Invalid button");
            sc.close();
        }
    }
}
