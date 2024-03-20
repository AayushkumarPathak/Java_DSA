<<<<<<< HEAD
import java.util.*;

public class array2{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size:");
        int size = sc.nextInt();
        int marks[] = new int[size];
        for (int i=0;i<size;i++){
            System.out.println("Enter the elements");
            marks[i] = sc.nextInt();

        }
        for (int i=0;i<size;i++){
            System.out.println(marks[i]);
        }
        System.out.println("The length of array is:"+marks.length);
        sc.close();
    }
=======
import java.util.*;

public class array2{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size:");
        int size = sc.nextInt();
        int marks[] = new int[size];
        for (int i=0;i<size;i++){
            System.out.println("Enter the elements");
            marks[i] = sc.nextInt();

        }
        for (int i=0;i<size;i++){
            System.out.println(marks[i]);
        }
        System.out.println("The length of array is:"+marks.length);

    }
>>>>>>> 3d252e668d782d679b3f6ca29f7ef2456389e2cb
}