package bean;

import java.util.ArrayList;
import java.util.List;

public class GraphNodeAirport {
    String airport;
    List<String> neighbors = new ArrayList<>();
    boolean visited;
}
