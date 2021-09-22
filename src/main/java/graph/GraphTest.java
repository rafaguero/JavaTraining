package graph;

public class GraphTest {
    public static void main(String[] args) {
        GraphNodeInt n1 = new GraphNodeInt(1);
        GraphNodeInt n2 = new GraphNodeInt(2);
        GraphNodeInt n3 = new GraphNodeInt(3);
        GraphNodeInt n4 = new GraphNodeInt(4);
        GraphNodeInt n5 = new GraphNodeInt(5);
        n1.neighbors = new GraphNodeInt[]{n2, n3, n5};
        n2.neighbors = new GraphNodeInt[]{n1, n4};
        n3.neighbors = new GraphNodeInt[]{n1, n4, n5};
        n4.neighbors = new GraphNodeInt[]{n2, n3, n5};
        n5.neighbors = new GraphNodeInt[]{n1, n3, n4};
        breathFirstSearch(n1, 5);
    }

    private static void breathFirstSearch(GraphNodeInt root, int x) {
        if (root.val == x) {
            System.out.println("find in root");
        }
        QueueGraph queue = new QueueGraph();
        root.visited = true;
        queue.enqueue(root);
        while (queue.first != null) {
            GraphNodeInt c = (GraphNodeInt) queue.dequeue();
            for (GraphNodeInt n : c.neighbors) {
                if (!n.visited) {
                    System.out.println(n + " ");
                    n.visited = true;
                    if (n.val == x) {
                        System.out.println("Find " + n);
                        queue.enqueue(n);
                    }
                }

            }
        }
    }
}
