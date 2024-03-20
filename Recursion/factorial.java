<<<<<<< HEAD
public class factorial {
    public static int fact(int n){
        if(n==0 || n==1){
            return 1;
        }
        int fact_n  = n * fact(n-1);
        return fact_n;


    }
    public static void main(String[] args) {
        int n = 5;
        System.out.println(fact(n));
        
    }
    
}
=======
public class factorial {
    public static int fact(int n){
        if(n==0 || n==1){
            return 1;
        }
        int fact_n  = n * fact(n-1);
        return fact_n;


    }
    public static void main(String[] args) {
        int n = 5;
        System.out.println(fact(n));
        
    }
    
}
>>>>>>> 3d252e668d782d679b3f6ca29f7ef2456389e2cb
