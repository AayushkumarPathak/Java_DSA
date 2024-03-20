<<<<<<< HEAD
import java.util.*;
public class test{
    // public static void main(String args[]){
    //     //  TEST THE CODES YOU WANT (:

    //     Scanner sc = new Scanner(System.in);
    //     int s = sc.nextInt();
    //      char al[] = new char[s];
         
    //      for (int i=0;i<s;i++){
    //         al[i]= sc.next().charAt(0);

    //      }
    //     for(int i=0;i<s;i++){
    //         System.out.println(al[i]);
    //     }
    // }

    // public static void main(String[] args){
    //     Scanner sc = new Scanner(System.in);
    //     System.out.println("Enter the size till to add:");
    //     int size = sc.nextInt();
    //     char alpha[] = new char[size];

    //     for (int i=0;i<size;i++){
    //         System.out.println("Enter the alphabet:");
    //         alpha[i] = sc.next().charAt(0);

    //     }
    //     System.out.println("Enter the element to find:");
    //     char x = sc.next().charAt(0);
    //     for (int j=0;j<alpha.length;j++){
    //         //  System.out.println(alpha[i]);
    //         if(alpha[j]==x){
    //             System.out.println(x+" Found at index: "+j);
    //         }

    //     }
    // }


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int s = sc.nextInt();
        int ary[] = new int[s];

        for(int i=0;i<s;i++){
            System.out.println("Enter the element:");
            ary[i]=sc.nextInt();

        }

        for(int i=0;i<s;i++){
            System.out.println(ary[i]);
        }
        System.out.println("Enter the index value:");
        int ind = sc.nextInt();
        int value = sc.nextInt();
        ary[ind] = value;
        for(int k=0;k<s;k++){
            System.out.println(ary[k]);
        }
        sc.close();
    }
=======
import java.util.*;
public class test{
    // public static void main(String args[]){
    //     //  TEST THE CODES YOU WANT (:

    //     Scanner sc = new Scanner(System.in);
    //     int s = sc.nextInt();
    //      char al[] = new char[s];
         
    //      for (int i=0;i<s;i++){
    //         al[i]= sc.next().charAt(0);

    //      }
    //     for(int i=0;i<s;i++){
    //         System.out.println(al[i]);
    //     }
    // }

    // public static void main(String[] args){
    //     Scanner sc = new Scanner(System.in);
    //     System.out.println("Enter the size till to add:");
    //     int size = sc.nextInt();
    //     char alpha[] = new char[size];

    //     for (int i=0;i<size;i++){
    //         System.out.println("Enter the alphabet:");
    //         alpha[i] = sc.next().charAt(0);

    //     }
    //     System.out.println("Enter the element to find:");
    //     char x = sc.next().charAt(0);
    //     for (int j=0;j<alpha.length;j++){
    //         //  System.out.println(alpha[i]);
    //         if(alpha[j]==x){
    //             System.out.println(x+" Found at index: "+j);
    //         }

    //     }
    // }


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int s = sc.nextInt();
        int ary[] = new int[s];

        for(int i=0;i<s;i++){
            System.out.println("Enter the element:");
            ary[i]=sc.nextInt();

        }

        for(int i=0;i<s;i++){
            System.out.println(ary[i]);
        }
        System.out.println("Enter the index value:");
        int ind = sc.nextInt();
        int value = sc.nextInt();
        ary[ind] = value;
        for(int k=0;k<s;k++){
            System.out.println(ary[k]);
        }
    }
>>>>>>> 3d252e668d782d679b3f6ca29f7ef2456389e2cb
}