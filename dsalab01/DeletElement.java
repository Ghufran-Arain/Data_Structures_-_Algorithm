/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dsalab01;
//import java.util.Arrays;
public class DeletElement {
    public static void main(String[] args) {
        
        int[] arr={8,16,24,32,40};
        System.out.println("Array Before Deletion: ");
       for(int i=0; i<arr.length; i++){
           System.out.print(arr[i]+" ");
       }
        System.out.println();
       int index=2;
       for(int i=index; i<arr.length-1;i++ ){
           arr[i]=arr[i+1];
       }
       arr[arr.length - 1] = 0;
        System.out.println("Array After Deletion: ");
       for(int i=0; i<arr.length;i++){
           System.out.print(arr[i]+" ");
       }
    }
 
}
