/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dsalab01;

 class MiddleInsert {
     public static void main(String[] args) {
         System.out.println("Before:");
        int[] array=new int[7];
        
            array[0]=50;
            array[1]=100;
            array[2]=150;
            array[3]=250;
            array[4]=300;
            array[5]=350;
        for(int i=0; i<array.length-1;i++){
            System.out.print(array[i]+" ");
        
        }   
            int newnum =200;
            array[0]=50;
            array[1]=100;
            array[2]=150;
            array[3]=newnum;
            array[4]=250;
            array[5]=300;
            array[6]=350;
             System.out.println();
        
        System.out.println("Array After: ");
        for(int i=0; i<array.length; i++){
            System.out.print(array[i]+" ");
        }
     }
}
