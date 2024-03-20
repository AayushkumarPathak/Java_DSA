import bank.*;
class Shape{
    public static void area(){
        System.out.println("Display area:");
    }
}

class Triangle extends Shape{
    int h,b;
    public void area(int b, int h){
        System.out.println(1/2*b*h);
    }
}
class EquiTrianle extends Triangle{
    public void area(int b, int h){
        System.out.println(1/2*b*h);
    }

}

public class inheritence2 {
    public static void main(String[] args) {
      bank.Account acc1 = new banck.Account();
        // Triangle t1 = new Triangle();
        // t1.h =  3;
        // t1.b = 4;
        // t1.area(t1.b,t1.h);
        

    }
    
}
