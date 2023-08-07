import java.util.*;


public class flight {
   static class edge{
int src;
int dst;
int wt;
public edge(int s,int d,int w){
    this.src=s;
    this.dst=d;
    this.wt=w;

}
    }
    public static void creategraph(ArrayList<edge>graph[],int flight[][]){
  for(int i=0;i<graph.length;i++){
 graph[i]=  new ArrayList<>();
  }
  for (int i=0;i<flight.length;i++){
    int src=flight[i][0];
    int dst=flight[i][1];
    int wt=flight[i][2];
    edge e=new edge(src, dst, wt);
    graph[src].add( e);
  }

    }


    static class Info{
        int v;
        int cost;
        int stops;
        public Info(int v,int c,int s){
            this.v=v;
            this.cost=c;
            this.stops=s;
        }

    }
    public static int chipestflight(int n,int flights[][],int src,int dest,int k){
        ArrayList<edge>graph[]=new ArrayList[n];
        creategraph(graph, flights);
        int dst[]=new int[n];
        //distance array
        for(int i=0;i<n;i++){
            if(i!=src){
                dst[i]=Integer.MAX_VALUE;
            }


        }
        Queue<Info>q=new LinkedList<>();
        q.add(new Info(src,0,0)
         );
       while(!q.isEmpty()){
        Info curr=q.remove();
        if(curr.stops>k){
            break;

        }



        for(int i=0;i<graph[curr.v].size();i++){
            edge e=graph[curr.v].get(i);
            int u=e.src;
            int v=e.dst;
            int wt=e.wt;
            if(dst[u]!=Integer.MAX_VALUE && curr.cost+wt<dst[v] && curr.stops<=k){
                dst[v]=dst[u]+wt;
                q.add(new Info(v, dst[v], curr.stops+1));

            }

        }
       }

       if(dst[dest]==Integer.MAX_VALUE){
        return -1;
           }
           else{
            return dst[dest];
           }




    }



    public static void main(String[] args) {
        int n=4;
        int flight[][]={{0,1,100},{1,2,100},{1,3,600},{2,3,200}};
        int src=0,dst=3,k=1;//one stop
      ArrayList<edge>graph[]=new ArrayList[n];
      int result = chipestflight(n, flight, src, dst, k);
        System.out.println("Cheapest flight cost with at most " + k + " stops: " + result);

    }
}
