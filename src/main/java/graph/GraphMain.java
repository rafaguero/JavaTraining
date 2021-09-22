package graph;

import java.util.*;

public class GraphMain {

    public boolean depthFirstSearch(String source, String target, Map<String,List<String>>graph){
        System.out.println(source);
        if ( source.equals(target)){
            System.out.println("Target found " + target);
            return true;
        }
        for (String node: graph.get(source)){
            if (depthFirstSearch(node,target,graph) == true){
                return true;
            }
        }
        return false;

    }
    public boolean breadthFirstSearch(String source, String target, Map<String,List<String>>graph){
        if (source.equals(target)){
            System.out.println("target found ");
            return true;
        }
        Queue<String>queueNode = new LinkedList<>();
        queueNode.add(source);
        while (!queueNode.isEmpty()){
            String node = queueNode.remove();
            if (node.equals(target)){
                System.out.println("target found ");
                return true;
            }

            for (String tempNode : graph.get(node)){
                queueNode.add(tempNode);
            }
        }
        return false;
    }
    public void findNode(String source, String target, Map<String,List<String>> graph){
        boolean found = depthFirstSearch("F","K",graph);
        System.out.println("depth first search " + found);
        found = breadthFirstSearch("F","K",graph);
        System.out.println("breath first search found " + found);

    }

    public static void main(String[] args) {
        GraphMain graphMain = new GraphMain();
        Map<String,List<String>>graph = new HashMap<>();
        graph.put("F", Arrays.asList("I","G"));
        graph.put("I", Arrays.asList("G","K"));
        graph.put("K",new ArrayList<>());
        graph.put("J",new ArrayList<>());
        graph.put("G",Arrays.asList("H"));
        graph.put("H",new ArrayList<>());
        graphMain.findNode("F","k",graph);
    }
}
