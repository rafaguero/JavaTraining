package graph;

public class GraphNodeInt {
    int val;
    GraphNodeInt next;
    GraphNodeInt[] neighbors;
    boolean visited;

    GraphNodeInt(int x){
        val = x;
    }

    GraphNodeInt(int x, GraphNodeInt[] n){
        val = x;
        neighbors = n;
    }
    public String toString(){
        return "value: " + this.val;
    }

}
