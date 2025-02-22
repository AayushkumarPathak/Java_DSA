import java.util.ArrayList;
import java.util.LinkedList;

public class HashMapCode {
    static class HashMap<K,V>{ // genric
        private class Node{
            K key;
            V val;

            public Node(K key,V val){
                this.key = key;
                this.val = val;
            }
        }
        private int n; //n 
        private int N;
        public LinkedList<Node> buckets[];//N

        @SuppressWarnings("unchecked")
        public HashMap(){
            this.N = 4;
            this.buckets = new LinkedList[4];

            for(int i=0;i<4;i++){
                this.buckets[i] = new LinkedList<>();
            }
        }
        private int hashFunction(K key){
            int hc = key.hashCode();
            int ans = Math.abs(hc) % N; //0 - 3 will be the remainder
            return ans;
        }
        private int searchInLL(K key,int bi){
            LinkedList<Node> ll = buckets[bi];
            int di = 0;
            for(int i=0;i<ll.size();i++){
                Node node = ll.get(i);
                if(node.key == key){
                    return di;
                }
                di++;
            }
            return -1;
        }
        @SuppressWarnings("unchecked")
        private void rehash(){
            LinkedList<Node> oldBuckets[] = buckets;
            buckets = new LinkedList[N*2];
            N = 2*N;
            for(int i=0;i<buckets.length;i++){
                buckets[i] = new LinkedList<>();
            }
            //nodes -> add in new buckets
            for(int i=0;i<oldBuckets.length;i++){
                LinkedList<Node> ll = oldBuckets[i];
                for(int j=0;j<ll.size();j++){
                    Node node = ll.remove();
                    put(node.key,node.val);
                }
            }
        }
        public void put(K key,V val){
            int bi = hashFunction(key);
            int di = searchInLL(key ,bi);

            if(di!=-1){
                Node node = buckets[bi].get(di);
                node.val = val;
            }else{
                buckets[bi].add(new Node(key, val));
                n++;
            }
            double lambda = (double)(n/N);
            if(lambda > 2.0){
                rehash();
            }
        }
        public boolean containsKey(K key){
            int bi = hashFunction(key);
            int di = searchInLL(key ,bi);

            if(di!=-1){
                return true;
            }else{
                return false;
            }
        }
        public V get(K key){
            int bi = hashFunction(key);
            int di = searchInLL(key ,bi);

            if(di!=-1){
                Node node = buckets[bi].get(di);
                return node.val;
            }else{
                return null;
            }
        }
        public V remove(K key){
            int bi = hashFunction(key);
            int di = searchInLL(key ,bi);

            if(di!=-1){
                Node node = buckets[bi].remove(di);
                n--;
                return node.val;
            }else{
                return null;
            }
        }
        public ArrayList<K> keySet(){
            ArrayList<K> keys = new ArrayList<>();
            for(int i=0;i<buckets.length;i++){
                LinkedList<Node> ll = buckets[i];
                for(Node node:ll){
                    keys.add(node.key);
                }
            }
            return keys;
        }
        public boolean isEmpty(){
            return n==0;
        }
    }
    public static void main(String[] args) {
        HashMap<String,Integer> hm = new HashMap<>();
        hm.put("India", 100);
        hm.put("Russia", 130);
        hm.put("Nepal", 50);
        hm.put("US",50);

        ArrayList<String> keys = hm.keySet();
        for(String key:keys){
            System.out.println(key); 
        }

        
    }
    
}
