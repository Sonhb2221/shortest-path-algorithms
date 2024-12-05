import java.util.*;

public class Graph {
    //luu tru cac dinh theo dang ban do
        Map<String, List<Dijkstra.Node>> adjacencyList;

        public Graph() {
            adjacencyList = new HashMap<>();
        }
    //them dich vao do thi
        public void addNode(String node) {
            adjacencyList.put(node, new ArrayList<>());
        }
    //them 1 canh tu dinh -> dinh -> trong so
        public void addEdge(String from, String to, int weight) {
            adjacencyList.get(from).add(new Dijkstra.Node(to, weight));
        }

        public void dijkstra(String start) {
            PriorityQueue<Dijkstra.Node> queue = new PriorityQueue<>();
            Map<String, Integer> distances = new HashMap<>();

            queue.add(new Dijkstra.Node(start, 0));
            distances.put(start, 0);

            while (!queue.isEmpty()) {
                Dijkstra.Node node = queue.poll();
                for (Dijkstra.Node neighbor : adjacencyList.get(node.name)) {
                    int newDistance = node.distance + neighbor.distance;
                    if (!distances.containsKey(neighbor.name) || newDistance < distances.get(neighbor.name)) {
                        distances.put(neighbor.name, newDistance);
                        queue.add(new Dijkstra.Node(neighbor.name, newDistance));
                    }
                }
            }

            for (Map.Entry<String, Integer> entry : distances.entrySet()) {
                System.out.println("Shortest distance: " + entry.getValue());
            }
        }
}