import java.util.*;
//      Program to find the desire character index in given string:
class stringtest
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String name = "Lovely professional Universtiy";
        System.out.println("Enter the character to find:");
        char s = sc.next().charAt(0);
        System.out.println(name);
        System.out.println(s);
        for(int i=0;i<name.length();i++){
            if(name.charAt(i)==s){
                System.out.println("Character found at:"+i);
            }
        }

    }
}