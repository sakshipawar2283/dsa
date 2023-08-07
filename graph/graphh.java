import java.util.*;

class graphh {
    static class edge {
        int src;
        int dist;
        int wt;

        edge(int s, int d, int w) {
            this.src = s;
            this.dist = d;
            this.wt = w;

        }
    }

    public static void main(String[] args) {
        int v = 5;
        ArrayList<edge>[] graph = new ArrayList[v];

        for (int i = 0; i < v; i++) {
                graph[i]=new ArrayList<>();
            // neighbous

        }

            graph[0].add(new edge(0, 1, 3));

            graph[1].add(new edge(1, 0, 3));
            graph[1].add(new edge(1, 3, 4));
            graph[1].add(new edge(1, 2, 2));

            graph[2].add(new edge(2, 1, 2));
            graph[2].add(new edge(2, 3, 2));
            graph[2].add(new edge(2, 4, 1));
            graph[3].add(new edge(3, 2, 2));

            graph[3].add(new edge(3, 1, 4));
            graph[4].add(new edge(4, 2, 1));


        for (int i = 0; i < graph[2].size(); i++) {
            edge e = graph[2].get(i);
            System.out.println(e.dist);
        }
    }
}