package graph;

import java.util.*;

public class SmallestPath {

    public static void main(String[] args) {
        Map<String, List<String>> graph = new HashMap<>();

        graph.put("w",Arrays.asList("x","v"));
        graph.put("x",Arrays.asList("w","y"));
        graph.put("v",Arrays.asList("w","z"));
        graph.put("y",Arrays.asList("x","z"));
        graph.put("z",Arrays.asList("y","v"));
        int result = getSmallestPath(graph,"w","z");
        System.out.println("result is " + result);

    }

    private static int getSmallestPath(Map<String, List<String>> graph, String source, String destination) {
        Queue<String> nodeQueue = new LinkedList<>();
        nodeQueue.add(source);
        String current = "";
        int count = 0;
        Map<String,Integer>nodeCount = new HashMap<>();
        nodeCount.put(source,0);
        List<String>neighbors;
        while (!nodeQueue.isEmpty()){
            current = nodeQueue.remove();
            if (current.equals(destination)){
                break;
            }
            count = nodeCount.get(current);
            count++;
            neighbors = graph.get(current);
            for (String node: neighbors){
                if (!nodeCount.containsKey(node)){
                    nodeCount.put(node,count);
                    nodeQueue.add(node);
                }
            }
        }

        return nodeCount.get(destination);


    }
}
