package JavaLca;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

class Graph {

    private List<Integer> path;

    public void FindAllPaths (List<List<Integer>> graph, int src, int dst) {

        // Clear previously stored paths
        path = new ArrayList<Integer>();
        path.clear();

        System.out.print("Source : " + src + " Destination : " + dst);

        path.add(src);

        DFS (graph, src, dst, path);
    }

    public void DFS (List<List<Integer>> graph, int src , int dst, List<Integer> path) {

        if (src == dst) {
            System.out.print("\nPath : " );
            for (Integer node : path)
                 System.out.print(node + " ");
        } else {
            for (Integer adjnode : graph.get(src)) {
                path.add(adjnode);
                DFS (graph, adjnode, dst, path);
                path.remove(path.size()-1);
            }
        }
    }

    public static void main (String[] args) {

        Graph obj = new Graph();
        List<Integer> node0, node1, node2, node3, node4;

        node0 = new ArrayList<Integer>();
        node1 = new ArrayList<Integer>();
        node2 = new ArrayList<Integer>();
        node3 = new ArrayList<Integer>();
        node4 = new ArrayList<Integer>();

        List<List<Integer>> graph1 = new ArrayList<List<Integer>>();
        // Graph 1

        /*  2 ---> 3
            ^      ^   
            |      |        
            0 ---> 1 */

        //  {{1,2}, {3}, {3}, {}}; // 0 -> (1,2); 1 -> (3); 2 -> (3); 3 -> (None)

        node0.add(1);
        node0.add(2);
        node1.add(3);
        node2.add(3);

        graph1.add(node0);
        graph1.add(node1);
        graph1.add(node2);
        graph1.add(node3);

        System.out.println("\n\nAll paths in graph G1");
        obj.FindAllPaths (graph1, 0, 3);
    }
}