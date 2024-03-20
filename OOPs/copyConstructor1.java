//  COPY CONSTRUCTOR IN JAVA
class Copy{
    String name;
    double cgpa;

    public void details(){
        System.out.println("The name of student is: "+this.name);
        System.out.println("The Cgpa of student is: "+this.cgpa);
    }

    Copy(Copy c2){
        this.name = c2.name;
        this.cgpa = c2.cgpa;
    }
    Copy(){

    }
}

public class copyConstructor1 {
    public static void main(String[] args) {
        Copy c1 = new Copy();
        c1.name = "Abhishek";
        c1.cgpa = 8.43;

        Copy c2 = new Copy(c1);
        c2.details();
    }
    
}
