import java.util.ArrayList;
public class MinHeap1 {
    static class MinHeap{
        ArrayList<Integer> arr = new ArrayList<>();

        public void insert(int val){
            arr.add(val);
            int x = arr.size()-1;
            int par = (x-1)/2;

            while(arr.get(x)<arr.get(par)){
                int temp = arr.get(x);
                arr.set(x, arr.get(par));
                arr.set(par, temp);
            }
        }
        public int peek(){
            return arr.get(0);
        }
        public void printHeap(){
            for(int i: arr){
                System.out.print(i+" ");
            }
        }
        public int delete(){
            int data = arr.get(0);
            //swap
            int temp = arr.get(0);
            arr.set(0, arr.size()-1);
            arr.set(arr.size()-1, temp);

            //del
            arr.remove(arr.size()-1);

            //heapify
            heapify(temp);
        }
        public void heapify(int i){

        }
    }
    public static void main(String[] args) {
        MinHeap minh = new MinHeap();
        minh.insert(3);
        minh.insert(5);
        minh.insert(2);
        minh.insert(4);
        minh.insert(10);
        minh.insert(1);
        System.out.println(minh.peek());
        minh.printHeap();
    }
    
}
