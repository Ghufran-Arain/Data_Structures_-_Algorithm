/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dsalab01;


public class task2DSA {
    public static void main(String[] args) {
        System.out.println("Before:");
        int[] array=new int[7];
        
              array[0]=5;
            array[1]=15;
            array[2]=25;
            array[3]=35;
            array[4]=45;
            array[5]=55;
        for(int i=0; i<array.length-1;i++){
            System.out.print(array[i]+" ");
        
        }   
            int newnum =12;
            array[0]=newnum;
            array[1]=5;
            array[2]=15;
            array[3]=25;
            array[4]=35;
            array[5]=45;
            array[6]=55;
             System.out.println();
        
        System.out.println("Array After: ");
        for(int i=0; i<array.length; i++){
            System.out.print(array[i]+" ");
        }
    }
 
}
