import java.util.HashMap;
import java.util.Set;


public class HashMap1{
    public static void main(String[] args) {
        HashMap<String,Integer> hm = new HashMap<>();

        hm.put("Russia",147);
        hm.put("India",135);
        hm.put("US",70);
        hm.put("Nepal",20);

        System.out.println(hm);
        System.out.println("Size of HashMap is: "+hm.size());

        //accessing the value using key

        int population = hm.get("India");
        System.out.println("Population of India is: "+population+" Million"); 
        //if value of requested key not exists then it returns null 

        System.out.println("Population of Australia is: "+hm.get("Australia"));

        //Searching / containsKey('key') returns true or false
        System.out.println("Country(India) is Present in HashTable or not: "+hm.containsKey("India"));
        System.out.println("Country(Australia) is Present in HashTable or not: "+hm.containsKey("Australia"));

        //Deletion / remove('key')- O(1) - delete the key and val and return that value

        // int temp = hm.remove("Nepal");
        // System.out.println("Deleted value(Nepal) has value: "+temp);
        // System.out.println("If key(Turkey) not exists returning null?: "+hm.remove("Turkey"));

        System.out.println("Final HashTable is: "+hm);

        System.out.println("Is Empty or not: "+hm.isEmpty()); 
        //clear() - clear the whole HashMap
        // hm.clear();
        // System.out.println(hm.size());

        //Traversing the HashMap
        Set<String> keys = hm.keySet();
        System.out.println(keys);

        for(String i: keys){
            System.out.println("key: "+i +", "+ "val: "+hm.get(i));
        }
    }
}

