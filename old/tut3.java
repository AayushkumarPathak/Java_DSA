import java.util.Scanner;
class tut3
{
    public static void main(String[]args)
    {
        int r;
        double pi=3.14,area;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the radius:");
        r=sc.nextInt();
        area=pi*r*r;
        System.out.println("The area is:"+area);
        sc.close();
    }
}