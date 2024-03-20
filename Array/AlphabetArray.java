<<<<<<< HEAD
import java.util.Scanner;

public class AlphabetArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the alphabet array: ");
        int size = scanner.nextInt();

        char[] alphabetArray = new char[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Enter the letter for index " + i + ": ");
            alphabetArray[i] = scanner.next().charAt(0);
        }

        System.out.println("Alphabet array: ");
        for (int i = 0; i < size; i++) {
            System.out.print(alphabetArray[i] + " ");
        }
        scanner.close();
    }
}
=======
import java.util.Scanner;

public class AlphabetArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the alphabet array: ");
        int size = scanner.nextInt();

        char[] alphabetArray = new char[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Enter the letter for index " + i + ": ");
            alphabetArray[i] = scanner.next().charAt(0);
        }

        System.out.println("Alphabet array: ");
        for (int i = 0; i < size; i++) {
            System.out.print(alphabetArray[i] + " ");
        }
    }
}
>>>>>>> 3d252e668d782d679b3f6ca29f7ef2456389e2cb
