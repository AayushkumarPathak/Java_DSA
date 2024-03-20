class Village{
    String name;
    int pincode;

    public void printInfo(String name){
        System.out.println(name);
    }
    public void printInfo(int pincode){
        System.out.println(pincode);
    }
    public void printInfo(String name, int age){
        System.out.println(name+" "+age);
    }



}
public class polymorphism1 {
    public static void main(String[] args) {
        Village v1 = new Village();
        v1.name = "Phagwara";
        v1.pincode = 14432;

        // use of polymorphism it can use multiple functions of same name a/q to parameter
        v1.printInfo(v1.pincode); //targeting function with parameter pincode
        v1.printInfo(v1.name);
        v1.printInfo(v1.name,v1.pincode);
    }
    
}
