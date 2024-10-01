/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dsalab01;

public class Linear_Search {
    public static void main(String[] args) {
        int[] array={4,6,2,8,10};
        int element=8;
        for(int i=0; i<array.length; i++){
            if(array[i]==element){
                System.out.println("Element "+array[i]+" found at index "+i);
                return;
            }
        
        }System.out.println("Element not found: ");
    }
}
