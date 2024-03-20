import java.util.Scanner;

class Merge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of arr1: ");
        int n = sc.nextInt();
        int arr1[] = new int[n];

        System.out.println("Enter element: ");
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }

        System.out.println("Enter length of arr2: ");
        int m = sc.nextInt();
        int arr2[] = new int[m];

        System.out.println("Enter element: ");
        for (int i = 0; i < m; i++) {
            arr2[i] = sc.nextInt();
        }
        int x = n + m;
        int mergedArr[] = new int[x];
        for (int i = 0; i < n; i++) {
            mergedArr[i] = arr1[i];
        }

        int k = n;
        for (int i = 0; i < m; i++) {
            mergedArr[k] = arr2[i];
            k++;
        }

        // printing merged array:
        for (int i = 0; i < x; i++) {
            System.out.print(mergedArr[i] + " ");
        }

        sc.close();

    }
}