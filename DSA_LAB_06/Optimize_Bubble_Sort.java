/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DSA_LAB_06;

public class Optimize_Bubble_Sort {
    
    public static void main(String[] args) {
        int count=0;
        int arr[]={5,4,3,2,1};
        for(int i=0; i<arr.length-1;i++){
            for(int j=0; j<arr.length-i-1; j++){
                if(arr[j]>arr[j+1]){
                    count++;
                    int temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println("Elements of Optimize bubblr sort are:");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
         System.out.println("Total Operations: "+count);
    }
  
}
