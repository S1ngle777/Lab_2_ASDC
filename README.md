# Лабораторная работа №2: Алгоритмы с графами и Задача коммивояжёра

## Задание 1: Реализация алгоритмов работы с графами

1. Написать программу, реализующую представление графа в виде структуры данных (например, матрицы смежности или списка смежности).
2. Реализовать алгоритмы поиска в глубину (DFS) и поиска в ширину (BFS) для заданного графа.
3. Провести тестирование алгоритмов на различных входных графах.


## Задание 2: Алгоритм коммивояжёра

1. Написать программу, реализующую алгоритм поиска приближенного решения для задачи коммивояжёра (например, метод ближайшего соседа или минимального остовного дерева).
2. Протестировать алгоритм на нескольких наборах данных, представляющих графы с разным числом вершин.
3. Измерить длину найденного маршрута и сравнить с оптимальным решением (если таковое известно).


## Пример работы

### Задание 1: Реализация алгоритмов работы с графами

![image](https://github.com/S1ngle777/Lab_2_ASDC/assets/128795707/b7c8f2c1-832e-42a9-8ede-65a6a35d0f3a)

![image](https://github.com/S1ngle777/Lab_2_ASDC/assets/128795707/9876295d-7be6-43a1-8446-334581d39ed5)

![image](https://github.com/S1ngle777/Lab_2_ASDC/assets/128795707/1d6fdf28-51fc-4775-9004-e35fd210f9c3)

Программа представляет собой консольное приложение на языке Java, которое позволяет пользователю работать с графами. Она состоит из двух основных классов: `Main` и `Graph`.

Класс `Graph` представляет собой структуру данных для графа. Он содержит матрицу смежности для представления графа и методы для добавления ребер в граф (`addEdge`), обхода графа в глубину (`DFS` и `DFSUtil`) и обхода графа в ширину (`BFS`). Также есть метод `printAdjacencyMatrix` для вывода матрицы смежности графа.

Класс `Main` содержит основной метод `main`, который является точкой входа в программу. В этом методе происходит следующее:

1. Пользователю предлагается выбрать между готовым графом и вводом графа вручную.
2. В зависимости от выбора пользователя создается граф с помощью класса `Graph` и добавляются ребра.
3. Выводится матрица смежности графа.
4. Пользователю предлагается ввести вершину, с которой начнется обход графа.
5. Производится обход графа в глубину и в ширину, начиная с выбранной вершины.

Обход графа в глубину (DFS) и обход графа в ширину (BFS) - это два основных метода обхода графа. DFS исследует как можно дальше вдоль каждой ветви перед тем, как отступить, в то время как BFS исследует все вершины на одном уровне перед переходом на следующий уровень.

### Задание 2: Алгоритм коммивояжёра

![image](https://github.com/S1ngle777/Lab_2_ASDC/assets/128795707/ba96427b-1e51-43a4-aac3-be33d56b3a72)

Программа решает задачу коммивояжера с использованием алгоритма ближайшего соседа. Задача коммивояжера - это классическая задача в области теории графов и комбинаторной оптимизации, которая состоит в поиске самого короткого возможного маршрута, который проходит через каждый город (или вершину графа) ровно один раз и возвращается в исходный город.

Программа состоит из двух основных частей:

1. Класс `TSP`, который реализует алгоритм ближайшего соседа для решения задачи коммивояжера. Этот класс принимает матрицу смежности графа в качестве входных данных и содержит метод `findTour`, который находит приближенное решение задачи коммивояжера, начиная с указанной вершины. Метод `findTour` также выводит найденный путь и его общую длину.

2. Главный класс `task2`, который создает экземпляр класса `TSP` с заданным графом, запрашивает у пользователя начальную вершину и вызывает метод `findTour` для нахождения и вывода пути.

Важно отметить, что алгоритм ближайшего соседа не гарантирует нахождения наиболее короткого пути для всех графов, но он обычно работает достаточно хорошо для небольших графов и может быть полезен как простой и быстрый алгоритм для приближенного решения задачи коммивояжера.

![image](https://github.com/S1ngle777/Lab_2_ASDC/assets/128795707/32fb4d6e-30b1-4bdd-a93c-0dfefee8bfb4)

