package graph;


import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class GraphTest2 {
    public void findTarget(){
        GraphNodeString iNode = new GraphNodeString("I");
        GraphNodeString jNode = new GraphNodeString("J");
        GraphNodeString kNode = new GraphNodeString("K");
        GraphNodeString lNode = new GraphNodeString("L");
        GraphNodeString mNode = new GraphNodeString("M");
        GraphNodeString oNode = new GraphNodeString("O");
        GraphNodeString nNode = new GraphNodeString("N");
        List<GraphNodeString> iNeighbors = Arrays.asList(jNode,kNode);
        iNode.neighbors = iNeighbors;
        List<GraphNodeString> jNeighbors = Arrays.asList(iNode,kNode);
        jNode.neighbors = jNeighbors;
        List<GraphNodeString> kNeighbors = Arrays.asList(iNode,jNode,lNode,mNode);
        kNode.neighbors = kNeighbors;
        List<GraphNodeString> lNeighbors = Arrays.asList(kNode);
        lNode.neighbors = lNeighbors;
        List<GraphNodeString> mNeighbors = Arrays.asList(kNode);
        mNode.neighbors = mNeighbors;
        List<GraphNodeString> oNeighbors = Arrays.asList(nNode);
        oNode.neighbors = oNeighbors;
        List<GraphNodeString> nNeighbors = Arrays.asList(oNode);
        nNode.neighbors = nNeighbors;
       // boolean found = depthFirstSearch(iNode,"M");
       // System.out.println("target found " + found);
        boolean found = breathFirstSearch(iNode,"M");
        System.out.println("target found " + found);
    }

    private boolean breathFirstSearch(GraphNodeString sourceNode,String target){
        System.out.println("source " + sourceNode.val);
        System.out.println("visited " + sourceNode.visited);
        Queue<GraphNodeString>queue = new LinkedList<>();
        queue.add(sourceNode);
        if (sourceNode.val.equals(target)){
            return true;
        }
        while (!queue.isEmpty()){
            GraphNodeString node = queue.remove();
            for (GraphNodeString tempNode : node.neighbors){
                if (tempNode.val.equals(target)){
                    return true;
                }

                if (tempNode.visited){
                    continue;
                }else {
                    tempNode.visited = true;
                    queue.add(tempNode);
                }
            }
        }
        return false;
    }

    private boolean depthFirstSearch(GraphNodeString sourceNode, String target) {
        System.out.println("source " + sourceNode.val);
        System.out.println("visited " + sourceNode.visited);
        if (sourceNode.visited){
            return false;
        }
        if (sourceNode.val.equals(target)){
            sourceNode.visited = true;
            System.out.println("here");
            return true;
        }
        sourceNode.visited = true;

        for (GraphNodeString node : sourceNode.neighbors){
            if (depthFirstSearch(node,target)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        GraphTest2 graphTest2 = new GraphTest2();
        graphTest2.findTarget();



    }
}
