import java.util.TreeMap;
public class TreeMap1 {
    public static void main(String[] args) {
        TreeMap<String,Integer> country = new TreeMap<>();

        country.put("India", 150);
        country.put("China", 200);
        country.put("Russia", 60);
        country.put("Nepal", 250);

        System.out.println(country);
    }
    
}
