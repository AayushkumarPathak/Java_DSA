
//inheritence
class Fig{
}
class Rec extends Fig{
    int l , b;
    public void ar(int l,int b){
        System.out.println(l*b);
    }
    
}
public class test {
    public static void main(String[] args) {
        Rec r = new Rec();
        r.l = 2;
        r.b = 3;
        r.ar(r.l,r.b);
    }
    
}
