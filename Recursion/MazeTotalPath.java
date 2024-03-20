<<<<<<< HEAD
public class MazeTotalPath {
    public static int totalPath(int i,int j, int n, int m){
        if(i==n-1 && j==m-1){
            return 1;
        }
        if(i==n || j== m){
            return 0;
        }
        //move down
        int downPath = totalPath(i+1, j, n, m);
        //move right
        int rightPath = totalPath(i, j+1, n, m);

        return downPath+rightPath;
    }
    public static void main(String[] args) {
        int n = 3, m = 3;
        int i = 0, j = 0;
        System.out.println("Total number of possible path in maze is: "+totalPath(i,j,n,m));
    }
    
}
=======
public class MazeTotalPath {
    public static int totalPath(int i,int j, int n, int m){
        if(i==n-1 && j==m-1){
            return 1;
        }
        if(i==n || j== m){
            return 0;
        }
        //move down
        int downPath = totalPath(i+1, j, n, m);
        //move right
        int rightPath = totalPath(i, j+1, n, m);

        return downPath+rightPath;
    }
    public static void main(String[] args) {
        int n = 3, m = 3;
        int i = 0, j = 0;
        System.out.println("Total number of possible path in maze is: "+totalPath(i,j,n,m));
    }
    
}
>>>>>>> 3d252e668d782d679b3f6ca29f7ef2456389e2cb
