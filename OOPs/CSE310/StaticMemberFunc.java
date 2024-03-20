class Student{
    int reg;
    String name;
    static String branch = "CSE";

    Student(int r,String n){
        reg = r;
        name = n;
    }
    public void displayData(){
        System.out.println("Name: "+name+", "+"Regno.: "+reg+", "+"Branch: "+branch);
        System.out.println("------------\t------------");
    }
    public static void updateBranch(){
        branch = "MEC";
    }
}

public class StaticMemberFunc {
    public static void main(String[] args) {
        Student s1 = new Student(1658, "Aayush");
        Student s2 = new Student(1665, "Abhishek");
        Student s3 = new Student(1328, "Akash");
        s1.displayData();
        s2.displayData();
        s3.displayData();
        Student.updateBranch();
        System.out.println("Updating...");
        s1.displayData();
        s2.displayData();
        s3.displayData();
        
    }
    
}
