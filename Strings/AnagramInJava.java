import java.util.*;
public class AnagramInJava {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st string:");
        String s1 = sc.nextLine();
        System.out.print("Enter 2nd string:");
        String s2 = sc.nextLine();

        char arr1[] = s1.toCharArray();
        char arr2[] = s2.toCharArray();

        char temp1;
        char temp2;
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr2.length-1;j++){
                temp1 = arr1[i];
                arr1[i] = arr1[j];
                arr1[j] = temp1; 
            }
        }

        for(int a=0;a<arr2.length-1;a++){
            for(int b=0;b<arr2.length-2;b++){
                temp2 = arr2[a];
                arr2[a] = arr2[b];
                arr2[b] = temp2; 
            }
        }
        // for(int m=0;m<arr1.length-1;m++){
        //     for(int n=0;n<arr2.length-2;m++){
        //         if(arr1[m]==arr2[n]){
        //             System.out.println("True");
        //         }
        //         else{
        //             System.out.println("False");
        //         }
        //     }
        // }



        sc.close();
    }
    
}
