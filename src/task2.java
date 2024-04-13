import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[][] graph = {
                { 0, 1, 2, 7, 5 },
                { 1, 0, 4, 4, 3 },
                { 2, 4, 0, 1, 2 },
                { 7, 4, 1, 0, 3 },
                { 5, 3, 2, 3, 0 }
        };

        // Создание объекта TSP
        TSP tsp = new TSP(graph);

        // Введите начальную вершину
        System.out.print("Введите начальную вершину: ");
        int start = scanner.nextInt();

        // Найти приблизительное минимальное расстояние
        tsp.findTour(start);

    }
}
