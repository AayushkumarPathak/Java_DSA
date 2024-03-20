import java.util.Scanner;

class ABC{
    int n;

    public void get(int i){
        n = i;
    }
    public void put(){
        int rev = 0;
        while(n>0){
            rev = (rev*10)+n%10;
            n = n/10;
        }
        System.out.println("Reversed no:"+rev);
    }
}
class PrimeNumber{
    int n;
    public void getData(){
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the num to check: ");
        n = sc.nextInt();
    }
    public void checkPrimeNo(){
        int cnt = 0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                cnt++;
            }
        }
        if(cnt == 2){
            System.out.println(n+" is prime number");
        }
        else{
            System.out.println(n+"n is not prime number");
        }
    }
}
public class Objects {

    public static void main(String[] args) {
        ABC aa = new ABC();
        aa.get(121);
        aa.put();

        PrimeNumber p = new PrimeNumber();
        p.getData();
        p.checkPrimeNo();
    }
    
}
