import java.util.Arrays;

public class TSP {
    // TSP - это задача коммивояжера.
    // Цель задачи коммивояжера - найти самый короткий путь, чтобы посетить все города и вернуться в исходный город.
    // Это NP-полная задача, что означает, что нет известного эффективного алгоритма для ее решения.
    // Однако существуют приближенные алгоритмы, которые могут дать хороший результат.
    // Один из таких алгоритмов - это алгоритм ближайшего соседа.
    // Алгоритм ближайшего соседа начинает с одной вершины и на каждом шаге выбирает ближайшую вершину, которую еще не посетил.
    // Этот алгоритм не всегда дает оптимальное решение, но он быстро работает и может дать хороший результат на небольших графах.
    // В этом примере мы реализуем алгоритм ближайшего соседа для задачи коммивояжера.
    // Мы начнем с заданной вершины и будем выбирать ближайшую вершину, которую еще не посетили, пока не посетим все вершины.
    // После этого мы вернемся к исходной вершине и вычислим общее расстояние, пройденное в обходе.

    private double[][] adjacencyMatrix;
    private boolean[] visited;
    private int numVertices;

    public TSP(double[][] matrix) {
        numVertices = matrix.length;
        adjacencyMatrix = matrix;
        visited = new boolean[numVertices];
    }

    public double findTour(int startVertex) {
        Arrays.fill(visited, false);
        double totalDistance = 0;
        int currentVertex = startVertex;

        System.out.print("Путь: " + startVertex);
        for (int i = 1; i < numVertices; i++) {
            visited[currentVertex] = true;
            int nearestVertex = -1;
            double shortestDistance = Double.MAX_VALUE;

            for (int vertex = 0; vertex < numVertices; vertex++) {
                if (!visited[vertex] && adjacencyMatrix[currentVertex][vertex] < shortestDistance) {
                    nearestVertex = vertex;
                    shortestDistance = adjacencyMatrix[currentVertex][vertex];
                }
            }

            visited[nearestVertex] = true;
            totalDistance += shortestDistance;
            System.out.print(" -> " + nearestVertex);
            currentVertex = nearestVertex;
        }

        // Вернуться к начальной вершине
        totalDistance += adjacencyMatrix[currentVertex][startVertex];
        System.out.println(" -> " + startVertex + "\nрасстояние: " + totalDistance);
        return totalDistance;
    }
}
