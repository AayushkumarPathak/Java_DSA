public class exceptionInjava {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        int div;
        try{
            div = a/b;
            System.out.println("div is:"+div);
        }
        catch( Exception e){
            System.out.println("we failed to divide.Reason:");
            System.out.println(e);
        }
    }
}
