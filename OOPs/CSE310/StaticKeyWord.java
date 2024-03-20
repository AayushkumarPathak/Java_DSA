class Student{
    int roll;
    String name;
    static String collegeName = "Lovely Professional University";

    Student(int r,String n){
        roll = r;
        name = n;
    }

    public void display(){
        System.out.println("Student Name: "+name);
        System.out.println("Student Roll: "+roll);
        System.out.println("College: "+collegeName);
        System.out.println("------------\t------------");
    }
    
}
public class StaticKeyWord {
    public static void main(String[] args) {
        Student stu1 = new Student(1, "Aayush");
        Student stu2 = new Student(2, "Probodh");
        Student stu3 = new Student(3, "Abhishek");
        stu1.display();
        stu2.display();
        stu3.display();

        
    } 
}
