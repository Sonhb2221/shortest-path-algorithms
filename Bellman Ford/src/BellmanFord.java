import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BellmanFord {
    int V, E;
    List<Edge> edges;


    BellmanFord(int V, int E) {
        this.V = V;
        this.E = E;
        edges = new ArrayList<>();
    }

    void addEdge(int src, int dest, int weight) {
        edges.add(new Edge(src, dest, weight));
    }

    // tìm đường đi ngắn nhất từ src đến các đỉnh khác
    void bellmanFord(int src) {
        // Khởi tạo khoảng cách từ đỉnh nguồn đến tất cả các đỉnh là vô cực.
        int[] dist = new int[V];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[src] = 0;

        // Lặp qua tất cả các cạnh V-1 lần
        for (int i = 0; i < V - 1; i++) {
            for (Edge edge : edges) {
                int u = edge.src;
                int v = edge.dest;
                int weight = edge.weight;
                if (dist[u] != Integer.MAX_VALUE && dist[u] + weight < dist[v]) {
                    dist[v] = dist[u] + weight;
                }
            }
        }

        // Kiểm tra chu trình âm. Nếu có chu trình âm, báo lỗi
        for (Edge edge : edges) {
            int u = edge.src;
            int v = edge.dest;
            int weight = edge.weight;
            if (dist[u] != Integer.MAX_VALUE && dist[u] + weight < dist[v]) {
                System.out.println("Đồ thị có chu trình âm!");
                return;
            }
        }
        printSolution(dist);
    }

    // để in khoảng cách ngắn nhất từ nguồn
    void printSolution(int[] dist) {
        System.out.println("Khoảng cách ngắn nhất từ đỉnh nguồn:");
        for (int i = 0; i < V; i++) {
            System.out.println("Đỉnh " + i + " : " + dist[i]);
        }
    }
}
