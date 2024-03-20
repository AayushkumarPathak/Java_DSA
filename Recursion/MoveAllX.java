<<<<<<< HEAD
public class MoveAllX {

    public static void moveAllx(String str, int idx, int count, String newStr){
        //base case
        if(idx == str.length()){
            for(int i=0;i<count;i++){
                newStr += 'x';
            }
            System.out.println("New String is: "+newStr);
            return;
        }
        //operation
        char currChar = str.charAt(idx);
        if(currChar == 'x'){
            count++;
            moveAllx(str, idx+1, count, newStr);
        }
        else{
            newStr +=currChar;
            moveAllx(str, idx+1, count, newStr);
        }
    }
    public static void main(String[] args) {
        String str = "axbcxxd";
        int idx = 0;
        int count = 0;
        String newStr = "";
        moveAllx(str, idx, count, newStr);

        
    }
    /*
     * Time complexity
     * O(n+count) = O(n+n) --> as count is also runs till n
     * O(2n) --> A/Q asinthotic notation constants is removed out
     * Therefore Time complexity is O(n)
     */
    
}
=======
public class MoveAllX {

    public static void moveAllx(String str, int idx, int count, String newStr){
        //base case
        if(idx == str.length()){
            for(int i=0;i<count;i++){
                newStr += 'x';
            }
            System.out.println("New String is: "+newStr);
            return;
        }
        //operation
        char currChar = str.charAt(idx);
        if(currChar == 'x'){
            count++;
            moveAllx(str, idx+1, count, newStr);
        }
        else{
            newStr +=currChar;
            moveAllx(str, idx+1, count, newStr);
        }
    }
    public static void main(String[] args) {
        String str = "axbcxxd";
        int idx = 0;
        int count = 0;
        String newStr = "";
        moveAllx(str, idx, count, newStr);

        
    }
    /*
     * Time complexity
     * O(n+count) = O(n+n) --> as count is also runs till n
     * O(2n) --> A/Q asinthotic notation constants is removed out
     * Therefore Time complexity is O(n)
     */
    
}
>>>>>>> 3d252e668d782d679b3f6ca29f7ef2456389e2cb
