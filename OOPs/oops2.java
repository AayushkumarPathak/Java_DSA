class Student{
    String name;
    int age;
    String address;

    public void printInfo(){
        System.out.println("The name of Student is "+this.name+"\n");
        System.out.println("The age of student is "+this.age+"\n");
        System.out.println("The address of Student is "+this.address+"\n");
    }

}

public class oops2 {
    public static void main(String[] args) {
        Student obj = new Student();
        obj.name = "Aayush";
        obj.age = 19;
        obj.address = "Ranchi";

        obj.printInfo();
        
    }
    
}
