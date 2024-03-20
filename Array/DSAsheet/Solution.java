import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static int countNeg(int n,int arr[]){
        
        int count = 0;
        for(int i=0;i<n;i++){
            int sum = 0;
            for(int j=i;j<n;j++){
                sum += arr[j];
                if(sum<0){
                    count++;
                }
            }
        }
        return count;
        
        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //initialization
        int n = sc.nextInt();
        int arr[] = new int[n];
        
        //input
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int ans = countNeg(n, arr);
        System.out.println(ans);
        
        sc.close();
    }
}