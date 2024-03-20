class Shape{
    String color;
}
class Triangle extends Shape{
    
}
class Circle extends Shape{
    

}
public class inheritence1 {
    public static void main(String[] args) {
        Triangle t1 = new Triangle();
        t1.color = "Red";
        System.out.println(t1.color);
        Circle c1 = new Circle();
        c1.color = "Blue";
        System.out.println(c1.color);
       
        

    }
    
}
