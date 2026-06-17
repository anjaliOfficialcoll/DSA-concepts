package Graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;



public class BST {
    static class Edge{
        int src;
        int dest;
        int wt;
        public Edge(int s,int d,int w){
            this.src=s;
            this.dest=d;
            this.wt=w;
        }
    }
    public static void bftGraph(ArrayList<Edge> graph[]){
        //create queue to store val
        Queue<Integer> q=new LinkedList<>();
        boolean visited[]=new boolean[graph.length];
        q.add(0);
        visited[0]=true;
        while(!q.isEmpty()){
            int curr=q.remove();
            System.out.print(curr+" ");
            for(int i=0;i<graph[curr].size();i++){
                Edge e=graph[curr].get(i);
                if(!visited[e.dest]){
                    visited[e.dest]=true;
                    q.add(e.dest);
                }

            }

        }


    }
    public static void main(String args[]){
        int V=7;
        ArrayList<Edge> graph[]=new ArrayList[V]; 
        for(int i=0;i<V;i++){
            graph[i]=new ArrayList<>();
        }
        graph[0].add(new Edge(0,1,1));
        graph[0].add(new Edge(0,2,1));

        graph[1].add(new Edge(1,3,1));
        graph[1].add(new Edge(1,0,1));

        graph[2].add(new Edge(2,0,1));
        graph[2].add(new Edge(2,4,1));

        graph[3].add(new Edge(3,5,1));
        graph[3].add(new Edge(3,1,1));
        graph[3].add(new Edge(3,4,1));

        graph[4].add(new Edge(4,3,1));
        graph[4].add(new Edge(4,2,1));
        graph[4].add(new Edge(4,5,1));

        graph[5].add(new Edge(5,6,1));
        graph[5].add(new Edge(5,4,1));
        graph[5].add(new Edge(5,3,1));

        graph[6].add(new Edge(6,5,1));

        bftGraph(graph);

    }
    
}
