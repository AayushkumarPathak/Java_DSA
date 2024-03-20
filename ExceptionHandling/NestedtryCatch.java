public class NestedtryCatch {
    public static void main(String[] args) {
        int marks[] = new int[5];
        marks[0] = 7;
        marks[1] = 56;
        marks[2] = 6;
        try{
            System.out.println("Welcome to TechMagnet.");
            try{
                System.out.println(marks[9]);
            }
            catch(ArrayIndexOutOfBoundsException e){
                System.out.println("Sorry this index does not exists");
                System.out.println("Exception in level 2");
            }
        }
        catch(Exception e){
            System.out.println("Exception in level 1");
        }
    }
    
}
