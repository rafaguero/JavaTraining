package graph;

import java.util.*;

public class SourceDest {

    private Map<Integer, List<GraphNodeInt>> graphMap = new HashMap<>();

    private void deathFirstTraversal(GraphNodeString sourceNode){
        if ( sourceNode.val.equals("K")){
            System.out.println("Found K");
            return;
        }
        System.out.println("sourceNode " + sourceNode.val);
        for (GraphNodeString node : sourceNode.neighbors){
            deathFirstTraversal(node);
        }
    }

    //Source f dest: K; can I travel from f to K?
    public static void main(String[] args) {
        GraphNodeString fNode = new GraphNodeString("F");
        GraphNodeString gNode = new GraphNodeString("G");
        GraphNodeString hNode = new GraphNodeString("H");
        GraphNodeString iNode = new GraphNodeString("I");
        GraphNodeString jNode = new GraphNodeString("J");
        GraphNodeString kNode = new GraphNodeString("K");
        List<GraphNodeString> fNeighbors = Arrays.asList(gNode,iNode);
        fNode.neighbors = fNeighbors;
        List<GraphNodeString> gNeighbors = Arrays.asList(hNode);
        gNode.neighbors = gNeighbors;
        List<GraphNodeString> hNeighbors = new ArrayList<>();
        hNode.neighbors = hNeighbors;
        List<GraphNodeString> iNeighbors = Arrays.asList(gNode,kNode);
        iNode.neighbors = iNeighbors;
        List<GraphNodeString> jNeighbors = new ArrayList<>();
        jNode.neighbors = jNeighbors;
        List<GraphNodeString> kNeighbors = new ArrayList<>();
        kNode.neighbors = kNeighbors;
        SourceDest sourceDest = new SourceDest();
        sourceDest.deathFirstTraversal(fNode);

    }

}
