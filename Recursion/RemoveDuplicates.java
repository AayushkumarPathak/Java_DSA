<<<<<<< HEAD
public class RemoveDuplicates {
    public static boolean map[] = new boolean[26];
    
    public static void removeDupl(String str, int idx, String newStr){
        //base case
        if(idx == str.length()){
            System.out.println("String after Removing Duplicates: "+newStr);
            return;
        }
        char currChar = str.charAt(idx);
        if(map[currChar - 'a'] == true){
            removeDupl(str, idx+1, newStr);
        }
        else{
            newStr += currChar;
            map[currChar-'a'] = true;
            removeDupl(str, idx+1, newStr);
        }

    }
    public static void main(String[] args) {
        String str = "abbccda";
        int idx  = 0;
        String newStr = "";
        removeDupl(str, idx, newStr);
    }
    
}
=======
public class RemoveDuplicates {
    public static boolean map[] = new boolean[26];
    
    public static void removeDupl(String str, int idx, String newStr){
        //base case
        if(idx == str.length()){
            System.out.println("String after Removing Duplicates: "+newStr);
            return;
        }
        char currChar = str.charAt(idx);
        if(map[currChar - 'a'] == true){
            removeDupl(str, idx+1, newStr);
        }
        else{
            newStr += currChar;
            map[currChar-'a'] = true;
            removeDupl(str, idx+1, newStr);
        }

    }
    public static void main(String[] args) {
        String str = "abbccda";
        int idx  = 0;
        String newStr = "";
        removeDupl(str, idx, newStr);
    }
    
}
>>>>>>> 3d252e668d782d679b3f6ca29f7ef2456389e2cb
