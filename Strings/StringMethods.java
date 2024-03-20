import java.util.*;
public class StringMethods{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = "aayush kumar pathak";
        System.out.println("The string s is: "+s);

        String lw = s.toLowerCase(); //lower case
        System.out.println("The string s in Lower case is: "+lw);

        String up = s.toUpperCase(); //upper case
        System.out.println("The string s in Upper case is: "+up);

        // String tr = s.trim();
        // System.out.println("The string s in Trimed Form: "+tr);  //  --------error--------

        String sb = s.substring(2); // substring with only start value till -1
        System.out.println("The Substring s is: "+sb);

        String sb1 = s.substring(2,17); //substring with start value and end value
        System.out.println("The Substring s with start and end is: "+sb1);

        String rep = s.replace('a','p'); //.replace() function
        System.out.println("The string s where A is replaced with P is:"+rep);

        boolean check1_start = s.startsWith("aa"); // start with return true if starts
        System.out.println("Whether string s is start with: "+check1_start);

        boolean check2_end = s.endsWith("ak"); //end with return true if endswith
        System.out.println("Whether string s is endswith: "+check2_end);












    }
}