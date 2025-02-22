import java.util.ArrayList;

public class HashPathQues {
    static class Edge{
        int src;
        int dest;
        int wt;

        public Edge(int s, int d, int w){
            this.src = s;
            this.dest = d;
            this.wt = w;
        }
    }
    public static void createGraph(ArrayList<Edge>[] graph){
        for(int i=0;i<graph.length;i++){
            graph[i] = new ArrayList<>();
        }
          //0
          graph[0].add(new Edge(0, 1, 1));
          graph[0].add(new Edge(0, 2, 1));
  
          //1
          graph[1].add(new Edge(1, 3, 1));
          graph[1].add(new Edge(1, 0, 1));
  
          //2
          graph[2].add(new Edge(2, 0, 1));
          graph[2].add(new Edge(2, 4, 1));
  
          //3
          graph[3].add(new Edge(3, 1, 1));
          graph[3].add(new Edge(3, 4, 1));
          graph[3].add(new Edge(3, 5, 1));
  
          //4
          graph[4].add(new Edge(4, 2, 1));
          graph[4].add(new Edge(4, 3, 1));
          graph[4].add(new Edge(4, 5, 1));
  
          //5
          graph[5].add(new Edge(5, 3, 1));
          graph[5].add(new Edge(5, 4, 1));
          graph[5].add(new Edge(5, 6, 1));
  
          //6
          graph[6].add(new Edge(6, 5, 1));
    }
    public static boolean hasPath(ArrayList<Edge>[] graph,int src, int dest, boolean vis[]){
        if(src == dest){
            return true;
        }
        vis[src] = true;
        for(int i=0;i<graph[src].size();i++){
            Edge e = graph[src].get(i);
            if(!vis[e.dest] && hasPath(graph, e.dest, dest, vis)){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int V = 7;
        @SuppressWarnings("unchecked")
        ArrayList<Edge>[] graph = new ArrayList[V];
        createGraph(graph);
        int src = 0;
        int dest = 5;
        boolean ans = hasPath(graph,src,dest,new boolean[V]);
        if(ans){
            System.out.println("Path exists between "+src+" and "+dest);
        }
        else{
            System.out.println("Path not exists between "+src+" "+dest);

        }
    }
}
