/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DSA_LAB_11;
import java.util.Scanner;
public class GraphAdjMatrix {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.print("Enter the number of vertices: ");
        int vertices=scanner.nextInt();

        System.out.print("Enter the number of edges: ");
        int edges=scanner.nextInt();

        int[][]adjacencyMatrix=new int[vertices][vertices];

        System.out.println("Enter the edges as pairs of vertices (u v): ");
        for (int i=0;i<edges;i++) {
            int u=scanner.nextInt();
            int v=scanner.nextInt();
            u--; 
            v--;
         adjacencyMatrix[u][v]=1;
        }
        System.out.println("Adjacency Matrix:");
        for (int i=0;i<vertices;i++) {
            for (int j=0;j<vertices;j++) {
                System.out.print(adjacencyMatrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}