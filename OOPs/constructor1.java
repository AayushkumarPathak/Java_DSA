class Acedmics{
    String name;
    int regNo;
    String Ccode;
    int marks;

    public void det(){
        System.out.println("Student name:"+this.name);
        System.out.println("Registration Number:"+this.regNo);
        System.out.println("Course code:"+this.Ccode);
        System.out.println("Marks in "+this.Ccode+" is: "+this.marks);

    }
    Acedmics(String name, int regNo,String Ccode,int marks){
        this.name = name;
        this.regNo = regNo;
        this.Ccode = Ccode;
        this.marks = marks;
    }
}
public class constructor1
{
    public static void main(String[] args) {
        Acedmics obj = new Acedmics("Aayush",1658,"CSE101",82);
        obj.det();
    }
}