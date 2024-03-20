import java.util.*;
public class palindrome{

    public String alphanumeric(String s){
        s = s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        return s;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = new String();
        System.out.println("Enter the string to check:");
        s = sc.nextLine();
        int i,j,flag;
        i = 0;
        j = s.length();
        flag = 0;
        while(i<j && flag==0){
            if(s.charAt(i)!=s.charAt(j)){
                flag = 1;
            }
            i = i+1;
            j = j-1;
        }
        if(flag==0){
            System.out.println("Palindrome ");
        }
        else{
            System.out.println("Not Palindrome");
        }
        sc.close();

    }
}