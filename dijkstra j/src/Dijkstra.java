import javax.swing.plaf.ListUI;

public class Dijkstra {
    static class Node implements Comparable<Node> {
        String name;
        int distance;

        public Node(String name, int distance) {
            this.name = name;
            this.distance = distance;
        }

        public int compareTo(Node other) {
            return Integer.compare(this.distance, other.distance);
        }
    }
}
