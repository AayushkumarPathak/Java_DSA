
class Heap{
    int arr[] = new int[100];
    int size;

    Heap(){
        arr[0] = -1;
        size = 0;
    }
// 55 54 53 50 52

    public void swap(int arr[],int x,int y){
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }
    public void insert(int val){
        size = size+1;
        int idx = size;

        arr[size] = val;
        while(idx>1){
            int par = idx/2;

            if(arr[par]<arr[idx]){
                swap(arr, par,idx);
                idx = par;
            }
            else{
                return;
            }
        } 
    }

    public void printHeap(){
        for(int i=1;i<=size;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public void Heapify(int arr[],int n,int i){
        int lg = i;
        int left = 2*i;
        int right = 2*i+1;

        if(lg<n && arr[lg]<arr[left]){
            lg = left;
        }
        if(lg<n && arr[lg]<arr[right]){
            lg = right;
        }
        if(lg!=i){
            swap(arr, size, 1);
            Heapify(arr, n, lg);

        }
    }

    public void HeapSort(int arr[],int n){ 
        int size = n;
        while(size>1){
        swap(arr, arr[n], arr[1]);
        size--;
        Heapify(arr,size,1);
    }
    }
    
}

public class Heap1 {

    public static void main(String[] args) {
        Heap MaxHeap = new Heap();
         // 50 55 53 52
        MaxHeap.insert(50);
        MaxHeap.insert(55);
        MaxHeap.insert(53);
        MaxHeap.insert(52);
        MaxHeap.insert(54);
        System.out.println("Your Heap is:");
        MaxHeap.printHeap();
        
        
    }
}