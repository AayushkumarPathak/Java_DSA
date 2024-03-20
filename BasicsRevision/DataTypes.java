import java.util.*;
public class DataTypes{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 5;
        int b = 6;

        System.out.println("Sum is: "+a+b);

        float f = 1;
        System.out.println("Float: "+f);

        double d = 3.416;
        System.out.println("Double : "+d);

       char c = 'A';
       System.out.println("char: "+c);

       boolean bl = true;
       System.out.println("Boolean: "+bl);

       String name = "Aayush Pathak";
       System.out.println("Name: "+name);

       String n1 = name.substring(5);
       System.out.println(n1);
       System.out.println(name.substring(1,5));
       System.out.println(name.length());
    //    System.out.println(name.split(","));
       System.out.println(name.charAt(5));
       System.out.println(name.isEmpty());
       System.out.println(name.toLowerCase());
       System.out.println(name.toUpperCase());

       name.concat("Kumar");
       System.out.println(name);









        sc.close();
    }
}