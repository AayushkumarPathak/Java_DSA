import java.util.LinkedHashMap;
public class LinkedHashMap1 {
    public static void main(String[] args) {
        LinkedHashMap<String,Integer> lhm = new LinkedHashMap<>();

        lhm.put("India", 500);
        lhm.put("US", 50);
        lhm.put("China", 600);
        lhm.put("Nepal", 25);

        System.out.println(lhm);
        
    }
    
}
