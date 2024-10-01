/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dsalab01;
import java.util.Scanner;
public class Reverse_an_Array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of Elements of an Array: ");
        int num=sc.nextInt();
        System.out.println("Enter the elements of an Array: ");
        int[] array=new int[num];
       
        for(int i=0; i<num; i++){
            array[i]=sc.nextInt();
    }
        System.out.println("Array reversed Successfully! ");
        for(int i=array.length-1; i>=0;i--){
            System.out.print(array[i]+" ");
            
        }}
 
}
