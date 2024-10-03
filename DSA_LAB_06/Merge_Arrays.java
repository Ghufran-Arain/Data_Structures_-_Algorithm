/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DSA_LAB_06;

public class Merge_Arrays {
    public static void main(String[] args) {
        int arr1[]={1,2,3,0,0,0};
        int arr2[]={4,5,6};
        int j=0;
        for(int i=0; i<arr1.length; i++){
            if(arr1[i]==0){
                arr1[i]=arr2[j++];
            }
        }
        for(int i: arr1){
            System.out.print(i+" ");
        }
    }
}
