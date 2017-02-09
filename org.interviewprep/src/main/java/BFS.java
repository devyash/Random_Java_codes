import java.util.*;

public class BFS{

    public static void main(String[] args) {
        Graph g= new Graph(4);
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);

        System.out.println("Following is Breadth First Traversal "+
                "(starting from vertex 2)");

        g.bfs(2);
    }



}
class Graph{
    private int v;
    private  LinkedList<Integer> adj[];

    Graph(int v){
        this.v=v;
        this.adj= new LinkedList[v];
        for (int i=0;i<v;i++) {
            adj[i] = new LinkedList();
        }
    }

    void addEdge(int x, int y){
        this.adj[x].add(y);
    }

    void bfs(int s){
        boolean visited[]= new boolean[this.v];
        visited[s]=true;
        Queue<Integer> queue = new LinkedList<Integer>();
        queue.add(s);
        while(!queue.isEmpty()){
            int n = queue.poll();
            System.out.print(n+"->");
            visited[n]=true;
            Iterator <Integer> itr= adj[n].listIterator();
            while(itr.hasNext()){
                int ne=itr.next();
                if(!visited[ne]){
                queue.offer(ne);
            }
            }
        }

    }


}