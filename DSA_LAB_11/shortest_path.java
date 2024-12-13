/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DSA_LAB_11;

import java.util.*;

public class shortest_path {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of vertices: ");
        int vertices = scanner.nextInt();

        System.out.print("Enter the number of edges: ");
        int edges = scanner.nextInt();
        int[][] adjacencyMatrix = new int[vertices][vertices];

        System.out.println("Enter the edges as pairs of vertices (u v): ");
        for (int i = 0; i < edges; i++) {
            int u = scanner.nextInt();
            int v = scanner.nextInt();
            u--; 
            v--;
            adjacencyMatrix[u][v] = 1;
        }
        displayAdjacencyMatrix(adjacencyMatrix, vertices);
        System.out.print("Enter the starting vertex: ");
        int start = scanner.nextInt() - 1;
        System.out.print("Enter the destination vertex: ");
        int destination = scanner.nextInt() - 1;
        findShortestPath(adjacencyMatrix, vertices, start, destination);
    }
    public static void displayAdjacencyMatrix(int[][] matrix, int vertices) {
        System.out.println("Adjacency Matrix:");
        System.out.print("   ");
        for (int i = 0; i < vertices; i++) {
            System.out.print((i + 1) + " ");
        }
        System.out.println();

        for (int i = 0; i < vertices; i++) {
            System.out.print((i + 1) + ": ");
            for (int j = 0; j < vertices; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void findShortestPath(int[][] matrix, int vertices, int start, int destination) {
        Queue<List<Integer>> queue = new LinkedList<>();
        boolean[] visited = new boolean[vertices];
        queue.add(Arrays.asList(start));
        visited[start] = true;

        while (!queue.isEmpty()) {
            List<Integer> path = queue.poll();
            int current = path.get(path.size() - 1);
            if (current == destination) {
                System.out.println("Shortest Path Length: " + (path.size() - 1));
                System.out.print("Shortest Path: ");
                System.out.println(String.join(" → ", path.stream().map(v -> String.valueOf(v + 1)).toArray(String[]::new)));
                return;
            }
            for (int i = 0; i < vertices; i++) {
                if (matrix[current][i] == 1 && !visited[i]) {
                    visited[i] = true;
                    List<Integer> newPath = new ArrayList<>(path);
                    newPath.add(i);
                    queue.add(newPath);
                }
            }
        }
        System.out.println("No path exists between the vertices.");
    }
}
