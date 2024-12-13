/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DSA_LAB_11;
import java.util.*;

public class undirected_graph{

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
            adjacencyMatrix[v][u] = 1;
        }
        displayAdjacencyMatrix(adjacencyMatrix, vertices);

        detectConnectedComponents(adjacencyMatrix, vertices);
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
    public static void detectConnectedComponents(int[][] matrix, int vertices) {
        boolean[] visited = new boolean[vertices];
        List<List<Integer>> components = new ArrayList<>();
        for (int i = 0; i < vertices; i++) {
            if (!visited[i]) {
                List<Integer> component = new ArrayList<>();
                dfs(matrix, i, visited, component);
                components.add(component);
            }
        }
        System.out.println("Connected Components:");
        for (int i = 0; i < components.size(); i++) {
            System.out.print("Component " + (i + 1) + ": { ");
            System.out.println(String.join(", ", components.get(i).stream().map(v -> String.valueOf(v + 1)).toArray(String[]::new)) + " }");
        }
    }
    private static void dfs(int[][] matrix, int current, boolean[] visited, List<Integer> component) {
        visited[current] = true;
        component.add(current);
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[current][i] == 1 && !visited[i]) {
                dfs(matrix, i, visited, component);
            }
        }
    }
}
