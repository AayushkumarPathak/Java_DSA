import java.util.Scanner;

public class areas_function {

    public static float circle(float r){
        float area = (22/7)*r*r;
        return area;

    }
    public static float square(float s){

        float area1 = s*s;
        return area1;
    }


    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius:");
        float r = sc.nextFloat();
        float area = circle(r);
        System.out.println("The area of circle is:"+area);


        System.out.println("Enter the side:");
        float s = sc.nextFloat();
        float area1 = square(s);
        System.out.println("The area of Square is:"+area1);




    }
}
