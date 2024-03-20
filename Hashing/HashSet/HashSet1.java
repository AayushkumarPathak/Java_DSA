import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class HashSet1{

    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the no of ele to add: ");
        int n = sc.nextInt();

        //insertion
        System.out.print("Enter the ele to add: ");
        for(int i=0;i<n;i++){
            int ele = sc.nextInt();
            set.add(ele);
        }

        //searching - contains()
        System.out.print("Enter the ele to search: ");
        int x = sc.nextInt();
        if(set.contains(x)){
            System.out.println("Found in HashSet");
        }
        else{
            System.out.println("Not found in the HashSet");
        }
        //size of HashSet
        System.out.println("Size of Your HashSet is: "+set.size());

        //Deletion/remove
        System.out.println("Enter the ele to delete: ");
        int rm = sc.nextInt();
        set.remove(rm);

        //Traversing/Iterator
        Iterator<Integer> i = set.iterator();
        //hasNext() , next()

        System.out.println("hasNext() "+i.hasNext());
        System.out.print("Elements using next() Method");
        System.out.print(i.next()+" ");
        System.out.print(i.next()+" ");
        System.out.print(i.next()+" ");
        System.out.println();

        System.out.print("Elements in one go: ");
        while(i.hasNext()){
            System.out.print(i.next()+" ");
        }






        sc.close();
    }

}