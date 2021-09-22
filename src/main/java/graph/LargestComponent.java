package graph;

import java.util.*;

public class LargestComponent {

    void findLargestComponent() {
        Map<Integer, List<Integer>> graph = new HashMap<>();
        graph.put(0, Arrays.asList(8, 1, 5));
        graph.put(1, Arrays.asList(0));
        graph.put(5, Arrays.asList(0, 8));
        graph.put(8, Arrays.asList(0, 5));
        graph.put(2, Arrays.asList(3, 4));
        graph.put(3, Arrays.asList(2, 4));
        graph.put(4, Arrays.asList(3, 2));
        Set<Integer> visited = new HashSet<>();
        int count= 1;
        int largest = 0;
        Set<Integer> keys = graph.keySet();
        for (Integer key: keys){
            count = depthFirstT(key,graph,visited,count,0);
            if (count > largest){
                largest = count;
            }

        }
        System.out.println("largest component has " + largest);

    }

    private int depthFirstT(int current, Map<Integer, List<Integer>> graph, Set<Integer> visited,int count,int largest) {

        visited.add(current);
        for (Integer node: graph.get(current)){
            if (visited.contains(node)){
                return 0;
            }
            count++;
            depthFirstT(node,graph,visited,count,largest);

        }
        if (count > largest){
            largest = count;
        }

        return largest;
    }

    public static void main(String[] args) {
        LargestComponent largestComponent = new LargestComponent();
        largestComponent.findLargestComponent();

    }
}
