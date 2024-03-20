import java.util.*;
public class Student_score {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size:");
        int n = sc.nextInt();
        int arr[] = new int[n];

        for(int i=0;i<n;i++){
            System.out.print("Enter the elements");
            arr[i] = sc.nextInt();

        }
        int sum=0;
        System.out.print("Enter the Gender for Boy 'b' or Girl 'g':");
       char s = sc.next().charAt(0);
        for(int i=0;i<n;i+=2){
            if(s=='b'){
                sum=sum+arr[i];

            }
            else{
                sum=sum+arr[i];
            }

        }
        System.out.print("Sum is:"+sum);

        sc.close();
    }

    
}
