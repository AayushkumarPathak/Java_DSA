class MyThread extends Thread{
    public void run(){
        int i = 0;
        while(i<10){
            System.out.println("I am chatting");
            System.out.println("I am Good");
            i++;
        }
    }
}

class MyThread2 extends Thread{
    public void run(){
        int i = 0;
        while(i<10){
            System.out.println("I am cooking");
            System.out.println("I am feeling bad");
            i++;
        }
    }
}
public class MT1{


    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        MyThread2 t2 = new MyThread2();

        t1.start();
        t2.start();
    }
}