<<<<<<< HEAD
import java.util.ArrayList;
import java.util.Collections;

public class ArrayList1{
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        //add elements
        list.add(11);
        list.add(12);
        list.add(14);
        System.out.println(list);

        //get elements
        int el = list.get(2);
        System.out.println(el);

        //insert element
        list.add(2,13);
        System.out.println(list);

        //set element

        //modify element
        list.set(0, 10);
        System.out.println(list);

        //delete element
        list.remove(0);
        System.out.println(list);

        //size of arraylist
        int len = list.size();
        System.out.println(len);
        
        //loop in arraylist
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+" ");
        }
        
        //sorting in arrayList
        Collections.sort(list);
        System.out.println(list);
    }
=======
import java.util.ArrayList;
import java.util.Collections;

public class ArrayList1{
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        //add elements
        list.add(11);
        list.add(12);
        list.add(14);
        System.out.println(list);

        //get elements
        int el = list.get(2);
        System.out.println(el);

        //insert element
        list.add(2,13);
        System.out.println(list);

        //set element

        //modify element
        list.set(0, 10);
        System.out.println(list);

        //delete element
        list.remove(0);
        System.out.println(list);

        //size of arraylist
        int len = list.size();
        System.out.println(len);
        
        //loop in arraylist
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+" ");
        }
        
        //sorting in arrayList
        Collections.sort(list);
        System.out.println(list);
    }
>>>>>>> 3d252e668d782d679b3f6ca29f7ef2456389e2cb
}