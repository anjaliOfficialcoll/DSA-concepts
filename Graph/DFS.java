package Graph;

import java.util.ArrayList;
import java.util.List;

public class DFS {
    static class Edge{
        int src;
        int dest;
        public Edge(int s,int d){
            this.src=s;
            this.dest=d;
        }
    }
    public static void dfsGraph(ArrayList<Edge>[] graph,int curr,boolean visited[]){
        
        System.out.print(curr+" ");
        visited[curr]=true;
        for(int i=0;i<graph[curr].size();i++){
            Edge e=graph[curr].get(i);
            if(!visited[e.dest]){
                dfsGraph(graph,e.dest,visited);
            }
        }


    }
    public static void main(String args[]){
        int V=7;
        ArrayList<Edge> graph[]=new ArrayList[V];

        for(int i=0;i<V;i++){
            graph[i]=new ArrayList<>();
        }
        graph[0].add(new Edge(0,1));
        
        graph[0].add(new Edge(0,2));

        graph[1].add(new Edge(1,3));
        graph[1].add(new Edge(1,0));

        graph[2].add(new Edge(2,0));
        graph[2].add(new Edge(2,4));

        graph[3].add(new Edge(3,5));
        graph[3].add(new Edge(3,1));
        graph[3].add(new Edge(3,4));

        graph[4].add(new Edge(4,3));
        graph[4].add(new Edge(4,2));
        graph[4].add(new Edge(4,5));

        graph[5].add(new Edge(5,6));
        graph[5].add(new Edge(5,4));
        graph[5].add(new Edge(5,3));

        graph[6].add(new Edge(6,5));

        boolean visited[]=new boolean[graph.length];
        
        dfsGraph(graph,0,visited);
    }
    
}
