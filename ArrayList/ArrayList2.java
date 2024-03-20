<<<<<<< HEAD
import java.util.*;
public class ArrayList2 {
    public static void main(String[] args) {
        ArrayList<String> l = new ArrayList<String>();

        //add
        l.add("Tony");
        l.add("Aayush");
        l.add("Himanshu");
        l.add("Thor");

        System.out.println(l);

        //get
        String ele = l.get(3);
        System.out.println(ele);

        //insert
        l.add(2,"Priyanshu");
        System.out.println(l);

        Collections.sort(l);
        System.out.println(l);

        //remove
        l.remove(2);
        System.out.println(l);

        //length
        int ln = l.size();
        System.out.println(ln);

    }
    
}
=======
import java.util.*;
public class ArrayList2 {
    public static void main(String[] args) {
        ArrayList<String> l = new ArrayList<String>();

        //add
        l.add("Tony");
        l.add("Aayush");
        l.add("Himanshu");
        l.add("Thor");

        System.out.println(l);

        //get
        String ele = l.get(3);
        System.out.println(ele);

        //insert
        l.add(2,"Priyanshu");
        System.out.println(l);

        Collections.sort(l);
        System.out.println(l);

        //remove
        l.remove(2);
        System.out.println(l);

        //length
        int ln = l.size();
        System.out.println(ln);

    }
    
}
>>>>>>> 3d252e668d782d679b3f6ca29f7ef2456389e2cb
