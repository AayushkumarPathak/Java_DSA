class School{
    private int adharNo;
    public int regNo;
    String name;

    // School(int adharNo, int regNo,String name){
    //     this.adharNo = adharNo;
    //     this.name = name;
    //     this.regNo = regNo;
    // }
    public void setData(int adharNo,int regNo, String name){
        this.adharNo = adharNo;

    }
    public void displaydata(int adharNo,int regNo, String name){
        System.out.println("Adhar Number:"+adharNo);
        System.out.println("Registration Number:"+regNo);
        System.out.println("Name :"+name);
    }
    

}
public class School_M_Sys {
   
    public static void main(String[] args) {
        School sc = new School();
        sc.setData(121,123,"Akash");
        sc.displaydata(0, 0, null);


        
    }
    
}
