/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dsalab01;

public class SearchbyIndex {
    public static void main(String[] args) {
        int[] array={13,26,39,52,65};
        int target=40;
        for(int i=0; i<array.length; i++){
            if(array[i]==target){
                System.out.println("Element found at index "+i+":"+array[i]);
                return;
            }
        
        }System.out.println("Element not found:");
    }
}
