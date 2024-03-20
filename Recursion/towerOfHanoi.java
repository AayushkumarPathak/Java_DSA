<<<<<<< HEAD
public class towerOfHanoi {
    public static void towerHanoi(int n, String src, String helper, String dest){
        if(n == 1){
            System.out.println("transfer disk "+ n +" from "+ src + " to "+ dest);
            return;
        }
        towerHanoi(n-1, src, dest, helper);
        System.out.println("transfer disk "+ n +" from "+ src + " to "+ dest);
        towerHanoi(n-1, helper, src, dest);
    }

    public static void main(String[] args) {
        int n = 3;
        towerHanoi(n, "S", "H", "D");
    }
    
}
=======
public class towerOfHanoi {
    public static void towerHanoi(int n, String src, String helper, String dest){
        if(n == 1){
            System.out.println("transfer disk "+ n +" from "+ src + " to "+ dest);
            return;
        }
        towerHanoi(n-1, src, dest, helper);
        System.out.println("transfer disk "+ n +" from "+ src + " to "+ dest);
        towerHanoi(n-1, helper, src, dest);
    }

    public static void main(String[] args) {
        int n = 3;
        towerHanoi(n, "S", "H", "D");
    }
    
}
>>>>>>> 3d252e668d782d679b3f6ca29f7ef2456389e2cb
