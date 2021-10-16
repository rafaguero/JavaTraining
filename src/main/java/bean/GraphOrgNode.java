package bean;

import java.util.ArrayList;
import java.util.List;

public class GraphOrgNode {
    private String name;
    private String startMonth;
    private List<GraphOrgNode> neighbors = new ArrayList<>();
    boolean visited;

    public GraphOrgNode(String name, String startMonth, List<GraphOrgNode>neighbors){
        this.name = name;
        this.startMonth = startMonth;
        this.neighbors = neighbors;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStartMonth() {
        return startMonth;
    }

    public void setStartMonth(String startMonth) {
        this.startMonth = startMonth;
    }

    public List<GraphOrgNode> getNeighbors() {
        return neighbors;
    }

    public void setNeighbors(List<GraphOrgNode> neighbors) {
        this.neighbors = neighbors;
    }

    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }
}
