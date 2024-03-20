<<<<<<< HEAD
public class Backtracking1 {
    public static void printPerm(String str, String perm, int idx){
        //base case
        if(str.length() == 0){
            System.out.println(perm);
            return;
        }
        //main recur
        for(int i=0;i<str.length();i++){
            char currChar = str.charAt(i);
            String newStr = str.substring(0, i) + str.substring(i+1);
            printPerm(newStr, perm + currChar, idx+1);

        }
    }
    public static void main(String[] args) {
        String str = "abc";
        String perm = "";
        int idx = 0;
        printPerm(str, perm, idx);
    }
    
}
=======
public class Backtracking1 {
    public static void printPerm(String str, String perm, int idx){
        //base case
        if(str.length() == 0){
            System.out.println(perm);
            return;
        }
        //main recur
        for(int i=0;i<str.length();i++){
            char currChar = str.charAt(i);
            String newStr = str.substring(0, i) + str.substring(i+1);
            printPerm(newStr, perm + currChar, idx+1);

        }
    }
    public static void main(String[] args) {
        String str = "abc";
        String perm = "";
        int idx = 0;
        printPerm(str, perm, idx);
    }
    
}
>>>>>>> 3d252e668d782d679b3f6ca29f7ef2456389e2cb
