import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Выбрать готовый граф или создать рандомный
        System.out.println("Выбрать готовый граф (1) или ввести вручную(0)");
        int choice = scanner.nextInt();

        Graph graph;

        if (choice == 1) {
            graph = new Graph(6);
            graph.addEdge(0, 1);
            graph.addEdge(1, 2);
            graph.addEdge(2, 5);
            graph.addEdge(5, 3);
            graph.addEdge(3, 0);
            graph.addEdge(0, 4);
            graph.addEdge(4, 3);
            graph.addEdge(3, 2);
            graph.addEdge(1, 3);
            graph.addEdge(4, 5);
        }
        else {
            System.out.print("Введите количество вершин: ");
            int numVertices = scanner.nextInt();
            graph = new Graph(numVertices);
            System.out.print("Введите количество ребер: ");
            int numEdges = scanner.nextInt();
            for (int i = 0; i < numEdges; i++) {
                System.out.print("Введите вершину начала ребра: ");
                int src = scanner.nextInt();
                System.out.print("Введите вершину конца ребра: ");
                int dest = scanner.nextInt();
                graph.addEdge(src, dest);
            }
        }

        System.out.println("Матрица смежности:");
        graph.printAdjacencyMatrix();

        // Введите вершину, с которой начнется обход
        System.out.print("Введите вершину, с которой начнется обход: ");
        int start = scanner.nextInt();

        System.out.println("Обход в глубину (начиная с вершины " + start + "):");
        graph.DFS(start);

        System.out.println("\nОбход в ширину (начиная с вершины " + start + "):");
        graph.BFS(start);
    }
}