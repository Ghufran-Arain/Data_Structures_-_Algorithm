/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DSA_LAB_11;
import java.util.*;

public class All_paths {
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
        findAllPaths(adjacencyMatrix, vertices, start, destination);

        scanner.close();
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
    public static void findAllPaths(int[][] matrix, int vertices, int start, int destination) {
        boolean[] visited = new boolean[vertices];
        List<Integer> path = new ArrayList<>();
        System.out.println("Paths:");
        findAllPathsDFS(matrix, start, destination, visited, path);
    }
    private static void findAllPathsDFS(int[][] matrix, int current, int destination, boolean[] visited, List<Integer> path) {
        visited[current] = true;
        path.add(current);

        if (current == destination) {
            System.out.println(String.join(" → ", path.stream().map(v -> String.valueOf(v + 1)).toArray(String[]::new)) + " (Length: " + (path.size() - 1) + ")");
        } else {
            for (int i = 0; i < matrix.length; i++) {
                if (matrix[current][i] == 1 && !visited[i]) {
                    findAllPathsDFS(matrix, i, destination, visited, path);
                }
            }
        }
        visited[current] = false;
        path.remove(path.size() - 1);
    }
}

