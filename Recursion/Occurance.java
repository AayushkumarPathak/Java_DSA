<<<<<<< HEAD
public class Occurance {
    public static int first = 0;
    public static int last = 0;
    public static void firstlastOccurence(String str, int idx, char element){
        if(idx == str.length()){
            System.out.println(first);
            System.out.println(last);
            return;

        }
        char currChar = str.charAt(idx);
        if(currChar==element){
            if(first==-1){
                first = idx;
            }else{
                last = idx;
            } 
            
        }
        
        firstlastOccurence(str, idx+1, element);


    }
    public static void main(String[] args) {
        String str = "abaacdaefaah";
        firstlastOccurence(str, first, 'a');
    }
    
}
=======
public class Occurance {
    public static int first = 0;
    public static int last = 0;
    public static void firstlastOccurence(String str, int idx, char element){
        if(idx == str.length()){
            System.out.println(first);
            System.out.println(last);
            return;

        }
        char currChar = str.charAt(idx);
        if(currChar==element){
            if(first==-1){
                first = idx;
            }else{
                last = idx;
            } 
            
        }
        
        firstlastOccurence(str, idx+1, element);


    }
    public static void main(String[] args) {
        String str = "abaacdaefaah";
        firstlastOccurence(str, first, 'a');
    }
    
}
>>>>>>> 3d252e668d782d679b3f6ca29f7ef2456389e2cb
