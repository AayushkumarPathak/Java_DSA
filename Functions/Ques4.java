<<<<<<< HEAD
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
        sc.close();
    }
=======
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
>>>>>>> 3d252e668d782d679b3f6ca29f7ef2456389e2cb
}