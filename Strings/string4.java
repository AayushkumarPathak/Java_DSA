import java.util.*;
public class string4{
    public static void main(String args[]){
        // String name1 = "Tony";
        // String name2 = "Tony";

        // //compare
        // //  if s1>s2 -> +ve value
        // //  if s1==s2 -> 0
        // //  if s1<s2 -> - value

        // if(name1.compareTo(name2) ==0){
        //     System.out.println("String are equal");
        // }
        // else{
        //     System.out.println("Strings are not ");
        // }
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the string");
        String s1 = sc.nextLine();

        System.out.println("Enter the string");
        String s2 = sc.nextLine();

        if(s1.compareTo(s2) ==1){
            System.out.println("String are not equal & s1 is bigger");
        }else if(s1.compareTo(s2)==0){
            System.out.println("Strings are equal");
        }else{
            System.out.println("Strings are not equal & s2 is bigger");
        }






    }
}