<<<<<<< HEAD
import java.util.LinkedList;
public class HHLL2 {
    public static void main(String[] args) {
       LinkedList<Integer> list = new LinkedList<>();
       
       for(int i=1;i<=50;i++){
        list.addLast(i);
       }

       for(int j=0;j<list.size();j++){
        System.out.print(list.get(j)+" -> ");
       }
       System.out.println("null");
       list.removeIf(value -> value>25);
    //    for(int i=0;i<list.size();i++){
    //     while(i>=25){
    //         list.remove(i);
    //     }
    //    }
       System.out.println(list);

       
   }
    
}
=======
import java.util.LinkedList;
public class HHLL2 {
    public static void main(String[] args) {
       LinkedList<Integer> list = new LinkedList<>();
       
       for(int i=1;i<=50;i++){
        list.addLast(i);
       }

       for(int j=0;j<list.size();j++){
        System.out.print(list.get(j)+" -> ");
       }
       System.out.println("null");
       list.removeIf(value -> value>25);
    //    for(int i=0;i<list.size();i++){
    //     while(i>=25){
    //         list.remove(i);
    //     }
    //    }
       System.out.println(list);

       
   }
    
}
>>>>>>> 3d252e668d782d679b3f6ca29f7ef2456389e2cb
