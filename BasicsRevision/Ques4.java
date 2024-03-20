import java.util.*;
public class Ques4{
    public static float circumference(float r){
        float pi = 22/7;
        float circ = 2*pi*r;
        return circ;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of circle:");
        float r = sc.nextFloat();
        System.out.println(circumference(r));
    }
}