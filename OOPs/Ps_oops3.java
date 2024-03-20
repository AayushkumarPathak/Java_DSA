import java.util.*;
class Square{
    int side;

    public int area(int area){
        area = side*side;
        return area;

    }
    public int perimeter(int perimeter){
        perimeter = 4*side;
        return perimeter;
    }
}
public class Ps_oops3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Square obj = new Square();
        System.out.print("Enter the side of square:");
        obj.side = sc.nextInt();
        System.out.println("Area is: "+obj.area(0));
        System.out.println("Perimeter is: "+obj.perimeter(0));
        sc.close();
    }
    
}
