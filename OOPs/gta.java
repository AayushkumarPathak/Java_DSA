import java.util.*;
class Remote{
    int x;
    public void fire(){
        System.out.println("Firing...");
    }
    public void jump(){
        System.out.println("Jumping...");
    }
    public void run(){
        System.out.println("Running...");
    }
    public void hit(){
        System.out.println("Hitting");
    }

}
public class gta {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Remote obj = new Remote();
        System.out.print("Enter the Button:");
        obj.x = sc.nextInt();
        switch(obj.x){
            case 1:
            obj.fire();
            break;
            case 2:
            obj.jump();
            break;
            case 3:
            obj.run();
            break;
            case 4:
            obj.hit();
            break;
            default:
            System.out.println("Enter valid Button! ):");

        }
        sc.close();
        
    }
    
}
