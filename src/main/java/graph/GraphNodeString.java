package graph;

import java.util.List;

public class GraphNodeString {
    String val;
    List<GraphNodeString> neighbors;
    boolean visited;

    GraphNodeString(String x){
        val = x;
    }

    GraphNodeString(String x, List<GraphNodeString> n){
        val = x;
        neighbors = n;
    }
    public String toString(){
        return "value: " + this.val;
    }

}
