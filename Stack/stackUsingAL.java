
import java.util.ArrayList;
import java.util.Scanner;
public class stackUsingAL {

    static class Stack{
        static ArrayList<Integer> list = new ArrayList<>(); 
            public  boolean isEmpty(){
                return list.size() == 0;
            }
            public  void push(int data){
                list.add(data);
            }

            public  int pop(){
                if(isEmpty()){
                    System.out.println("Stack Underflow");

                    return -1;
                }
                int top = list.get(list.size()-1);
                list.remove(list.size()-1);
                return top;
            }

            public int peek(){
                if(isEmpty()){
                    System.out.println("Stack Underflow");
                    return -1;
                }
                return list.get(list.size()-1);
            }
            
       
    }
    public static void main(String[] args) {
        Stack s = new Stack();
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 0;
        while(i<n){
            int ele = sc.nextInt();
            s.push(ele);
            i++;
        }

        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }

        sc.close();
    }
    
}
