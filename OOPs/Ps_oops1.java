class Employee{
    int salary;
    String name;

    public int getsalary(){
        return salary;

    }
    public String getname(){
        return name;
    }
    public void setname(String n){
        name = n;
    }
}

class Phone{
    public void ring(){
        System.out.println("Ringing...");
    }
    public void vibrating(){
        System.out.println("Vibrating...");
    }

}
public class Ps_oops1 {
    public static void main(String[] args) {
        Employee obj = new Employee();
        obj.setname("AayushPathak");
        obj.salary = 60000;
        
        System.out.println(obj.getsalary());
        System.out.println(obj.getname());

        Phone ph = new Phone();
        ph.ring();
        ph.vibrating();
        
    }
    
}
