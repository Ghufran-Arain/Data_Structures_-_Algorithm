/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DSA_LAB_11;


import java.util.Scanner;

public class GraphAdjMatrix_2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of vertices: ");
        int vertices = scanner.nextInt();
        System.out.print("Enter the number of edges: ");
        int edges = scanner.nextInt();

        int[][] adjacencyMatrix = new int[vertices][vertices];
        System.out.println("Enter the edges as pairs of vertices (u v): ");
        for (int i=0;i<edges;i++) {
            int u=scanner.nextInt();
            int v=scanner.nextInt();
            u--; 
            v--;
            adjacencyMatrix[u][v]=1;
        }
        displayAdjacencyMatrix(adjacencyMatrix, vertices);
    }
    public static void displayAdjacencyMatrix(int[][] matrix, int vertices) {
        System.out.println("Adjacency Matrix:");
        System.out.print("   ");
        for (int i=0;i<vertices;i++) {
            System.out.print((i+1)+ " ");
        }
        System.out.println();

        for (int i=0;i<vertices;i++) {
            System.out.print((i+1)+": ");
            for (int j=0;j<vertices;j++) {
                System.out.print(matrix[i][j]+ " ");
            }
            System.out.println();
        }
    }
}
