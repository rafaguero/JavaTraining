package graph;

public class QueueGraph {
    GraphNodeInt first, last;
    public void enqueue(GraphNodeInt n){
        if (first == null){
            first = n;
            last = first;
        }else {
            last.next = n;
            last = n;
        }
    }

    public GraphNodeInt dequeue() {
        if (first == null){
            return null;
        }else {
            GraphNodeInt temp = new GraphNodeInt(first.val, first.neighbors);
            first = first.next;
            return temp;
        }
    }
}
