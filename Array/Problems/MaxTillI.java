package Problems;
import java.util.*;

public class MaxTillI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int mx = -19999999;
        int n = sc.nextInt();

        int arr[] = new int[n];
        
        for(int i=0; i<n;i++){
            arr[i] = sc.nextInt();
        }

        // for(int j=0;j<n;j++){
        //     mx = (mx,arr[j]);
        // }
        sc.close();
    }
    
}
