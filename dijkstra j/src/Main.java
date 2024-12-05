//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Graph graph = new Graph();
        graph.addNode("A");
        graph.addNode("B");
        graph.addNode("C");
        graph.addNode("D");
        graph.addNode("E");

        graph.addEdge("A", "B", 5);
        graph.addEdge("A", "C", 3);
        graph.addEdge("B", "C", 4);
        graph.addEdge("B", "D", 3);
        graph.addEdge("B", "E", 4);
        graph.addEdge("C", "B", 2);
        graph.addEdge("C", "D", 5);
        graph.addEdge("C", "E", 6);
        graph.addEdge("E", "D", 2);

        graph.dijkstra("A");

    }
}