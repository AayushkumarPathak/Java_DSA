<<<<<<< HEAD
import java.util.LinkedList;

public class HWLL1 {
    public static void main(String[] args) {
        LinkedList<Integer> l = new LinkedList<>();

        l.addLast(1);
 
        l.addLast(5);
        l.addLast(7);
        l.addLast(3);
        l.addLast(8);
        l.addLast(2);
        l.addLast(3);

        System.out.println(l);
        
        int x = 7;
        for(int i=0;i<l.size();i++){
            if(l.get(i)== x){
                System.out.println("Found at "+ i);
            }
            
        }
    }
    
}
=======
import java.util.LinkedList;

public class HWLL1 {
    public static void main(String[] args) {
        LinkedList<Integer> l = new LinkedList<>();

        l.addLast(1);
 
        l.addLast(5);
        l.addLast(7);
        l.addLast(3);
        l.addLast(8);
        l.addLast(2);
        l.addLast(3);

        System.out.println(l);
        
        int x = 7;
        for(int i=0;i<l.size();i++){
            if(l.get(i)== x){
                System.out.println("Found at "+ i);
            }
            
        }
    }
    
}
>>>>>>> 3d252e668d782d679b3f6ca29f7ef2456389e2cb
