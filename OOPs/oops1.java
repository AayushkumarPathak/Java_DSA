// Object Oriented Programming In JAVA 
class Pen{
    String color; // blue,black,red
    String type; // gel, ballpoint


    public void write(){
        System.out.println("Writing Something");
    }
    public void printColor(){
        System.out.println("The color of pen is "+this.color);
    }
    public void printType(){
        System.out.println("The type of pen is: "+this.type);
    }
}

public class oops1{
    public static void main(String args[]){
        Pen pen1 = new Pen();
        pen1.color = "blue";
        pen1.type = "gel";
        pen1.write();
        pen1.printColor();
        pen1.printType();

        Pen pen2 = new Pen();
        pen2.color = "red";
        pen2.type = "ballpoint";
        pen2.write();
        pen2.printColor();
        pen2.printType();



    }
}