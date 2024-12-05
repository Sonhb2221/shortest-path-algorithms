//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int V = 6;
        int E = 8;

        BellmanFord graph = new BellmanFord(V, E);
        graph.addEdge(0, 1, 10);// S -> A (10)
        graph.addEdge(0, 2, 8);// S -> E(8)
        graph.addEdge(1, 3, 2);// A -> C(2)
        graph.addEdge(3, 4, -2);// C -> B(-2)
        graph.addEdge(4, 1, 1);//B - A(1)
        graph.addEdge(2, 5, 1);// E - D (1)
        graph.addEdge(5, 3, -1);//D -> C (-1)
        graph.addEdge(5, 1, -4);// D -> A(-4)


        graph.bellmanFord(0);
    }
}