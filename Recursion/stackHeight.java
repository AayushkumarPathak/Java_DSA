<<<<<<< HEAD
public class stackHeight {
    public static int pow(int x, int n){
        if(n==0){
            return 1;
        }
        if(x==0){
            return 0;
        }
        int xPownm1 = pow(x,n-1);
        int xPown = x * xPownm1;
        return xPown;

    }
    public static void main(String[] args) {
        int x = 2, n = 8;
        int ans = pow(x,n);
        System.out.println("Therefore "+x+"^"+n+": "+ans);
       
        
    }
    
    
}
=======
public class stackHeight {
    public static int pow(int x, int n){
        if(n==0){
            return 1;
        }
        if(x==0){
            return 0;
        }
        int xPownm1 = pow(x,n-1);
        int xPown = x * xPownm1;
        return xPown;

    }
    public static void main(String[] args) {
        int x = 2, n = 8;
        int ans = pow(x,n);
        System.out.println("Therefore "+x+"^"+n+": "+ans);
       
        
    }
    
    
}
>>>>>>> 3d252e668d782d679b3f6ca29f7ef2456389e2cb
