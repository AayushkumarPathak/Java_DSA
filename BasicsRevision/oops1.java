import java.util.Scanner;

class Pen{
     Scanner sc = new Scanner(System.in);
        String type;
        int price;

        // Pen(String type,int price){
        //     this.price = price;
        //     this.type = type;

        // }

        public void getData(){
            System.out.println("Enter the Type");
            type = sc.nextLine();

            System.out.println("Enter price");
            price = sc.nextInt();

        }

        public void printData(){
            System.out.println("Type: "+ type);
            System.out.println("Price"+price);
        }
    }

public class oops1 {
   
    
    
    public static void main(String[] args){
      Pen p1 = new Pen();
      p1.getData();
      p1.printData();
    }
    
}
