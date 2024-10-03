package DSA_LAB_06;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


public class Bubble_Sort_in_array {
    public static void main(String[] args) {
        int array[]={10,1,3,6,5,9,7,2,4,8};
        
        for(int i=0; i<array.length-1; i++){
            for(int j=0; j<array.length-1; j++){
                if(array[j]>array[j+1]){    
                    int temp=array[j+1];
                    array[j+1]=array[j];
                    array[j]=temp;
                
                }
            }
        }
        System.out.println("Array after sorting:");
        for(int i=0; i<array.length; i++){
            System.out.print(array[i]+" ");
        }
    }
  
}
