package problems;

import bean.GraphOrgNode;
import java.util.Arrays;

public class GraphOrg {

    private GraphOrgNode buildGraph(){
        GraphOrgNode node2 = new GraphOrgNode("Juan","Feb",null);
        GraphOrgNode node4 = new GraphOrgNode("Melissa","Mar",null);
        GraphOrgNode node5 = new GraphOrgNode("Lindsay","Jan",null);
        GraphOrgNode node7 = new GraphOrgNode("Julie","Jan",null);
        GraphOrgNode node8 = new GraphOrgNode("Diego","Jan",null);

        GraphOrgNode node6 = new GraphOrgNode("Ivan","Jan", Arrays.asList(node7,node8));
        GraphOrgNode node3 = new GraphOrgNode("Magui","Jan", Arrays.asList(node4,node5,node6));
        GraphOrgNode node1 = new GraphOrgNode("Rafael","Jan", Arrays.asList(node2,node3));
        return node1;
    }
    private int getLeafCount(GraphOrgNode node){
        //count the nodes without children add to Map
        int counter = 0;
        if (node.getNeighbors() == null){
            return 1;
        }

        for (GraphOrgNode tempNode: node.getNeighbors()){
                counter = getLeafCount(tempNode) + counter;
            }
        return counter;
        }

    private int getUniqueNodeCount(GraphOrgNode node) {
        int counter = 0;
        if (node.getNeighbors() == null){
            return 1;
        }
        for (GraphOrgNode tempNode:node.getNeighbors()){
            if (node.getStartMonth().equals(tempNode.getStartMonth())){
                counter = getUniqueNodeCount(tempNode) + counter;
            }
        }
        return counter;
    }

    public static void main(String[] args) {
        GraphOrg graphOrg = new GraphOrg();
        GraphOrgNode root = graphOrg.buildGraph();
        int noLeafs = graphOrg.getLeafCount(root);
        int noUniqueNodes = graphOrg.getUniqueNodeCount(root);
        System.out.println("number of unique nodes " + noUniqueNodes);
        System.out.println("number of leafs " + noLeafs);
    }

}
