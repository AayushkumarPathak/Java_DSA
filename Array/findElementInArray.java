<<<<<<< HEAD
import java.util.*;
public class findElementInArray{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size till to add:");
        int s = sc.nextInt();
        int n[] = new int[s];
        for (int i = 0; i<s;i++){
            System.out.println("Enter the element:");
            n[i] = sc.nextInt();

        }
        System.out.println("Enter the element x to find:");
        int x = sc.nextInt();
        for (int j=0;j<n.length;j++){
            if(n[j]==x){
                System.out.println("x found at index:"+j);
            }
            
        }
        sc.close();
    }
=======
import java.util.*;
public class findElementInArray{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size till to add:");
        int s = sc.nextInt();
        int n[] = new int[s];
        for (int i = 0; i<s;i++){
            System.out.println("Enter the element:");
            n[i] = sc.nextInt();

        }
        System.out.println("Enter the element x to find:");
        int x = sc.nextInt();
        for (int j=0;j<n.length;j++){
            if(n[j]==x){
                System.out.println("x found at index:"+j);
            }
            
        }
    }
>>>>>>> 3d252e668d782d679b3f6ca29f7ef2456389e2cb
}