import java.util.Scanner;

public class MergeKsortedArray {

    public static void bubblesort(int merged[]){
        for(int i=0;i<merged.length-1;i++){
            for(int j=0;j<merged.length-1-i;j++){
                int temp = merged[j];
                if(merged[j]>merged[j+1]){
                    merged[j] = merged[j+1];
                    merged[j+1] = temp;
                }
            }

        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of array:");
        int ch = sc.nextInt();
        int arr[][] = new int[ch][];

        for(int i=0;i<ch;i++){
            System.out.print("Enter the size:");
            int n = sc.nextInt();
            arr[i] = new int[n];
            
            for(int j=0;j<n;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        int size = 0;
        for(int i=0;i<ch;i++){
            size += arr[i].length;

        }
        int merged[] = new int[size];
        int idx = 0;
        for(int i=0;i<ch;i++){
            for(int j=0;j<arr[i].length;j++){
                merged[idx++] = arr[i][j];
            }
        }
        bubblesort(merged);
        for(int i:merged){
            System.out.print(i+" ");
        }
        

        sc.close();
    }
    
}
