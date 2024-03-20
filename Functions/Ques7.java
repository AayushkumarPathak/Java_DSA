<<<<<<< HEAD
import java.util.*;
public class Ques7{
    public static void main(String args[]){
        int pos=0,neg=0,zeros=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 to continue & 0 to exit:");
        int input = sc.nextInt();

        while(input==1){
            System.out.println("Enter your number:");
            int n = sc.nextInt();
            if (n>0){
                pos++;
            }
            else if (n<0){
                neg++;
            }
            else{
                zeros++;
            }
            System.out.println("Enter 1 to continue & 0 to exit:");
            input = sc.nextInt();
            
        }
        System.out.println("Positives:"+pos);
        System.out.println("Negatives:"+neg);
        System.out.println("Zeroes:"+zeros);
        sc.close();

    }

=======
import java.util.*;
public class Ques7{
    public static void main(String args[]){
        int pos=0,neg=0,zeros=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 to continue & 0 to exit:");
        int input = sc.nextInt();

        while(input==1){
            System.out.println("Enter your number:");
            int n = sc.nextInt();
            if (n>0){
                pos++;
            }
            else if (n<0){
                neg++;
            }
            else{
                zeros++;
            }
            System.out.println("Enter 1 to continue & 0 to exit:");
            input = sc.nextInt();
            
        }
        System.out.println("Positives:"+pos);
        System.out.println("Negatives:"+neg);
        System.out.println("Zeroes:"+zeros);

    }

>>>>>>> 3d252e668d782d679b3f6ca29f7ef2456389e2cb
}