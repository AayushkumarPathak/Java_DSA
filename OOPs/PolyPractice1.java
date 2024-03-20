class Cities{
    String name;
    int pincode;

    public void printinfo(String name){
        System.out.println("The name of city is:"+name);

    }
    public void printinfo(int pincode){
        System.out.println("The pincode of city is:"+pincode);

    }
    public void printinfo(String name,int pincode){
        System.out.println("The name of city is "+ name);
        System.out.println("The pincode of city is:"+pincode);
    }


}

public class PolyPractice1 {
    public static void main(String[] args) {
        Cities c1 = new Cities();
        c1.name = "Jalandhar";
        c1.pincode = 1443;

        Cities c2 = new Cities();
        c2.name = "Ranchi";
        c2.pincode = 8283;


        c1.printinfo(c1.name);
        c1.printinfo(c1.pincode);
        c1.printinfo(c1.name, c1.pincode);

        c2.printinfo(c2.name);
        c2.printinfo(c2.pincode);
        c2.printinfo(c2.name, c2.pincode);

    }
    
}
