/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dsalab02;

public class DSALab02{
    public static void main(String[] args){
        int[]nums={1, 2, 3};
        int n=nums.length;
        int[]ans = new int[2*n];
        for (int i=0;i<n;i++){
            ans[i]=nums[i];
            ans[i+n]=nums[i];
        }
        for (int num:ans){
            System.out.print(num+" ");
        }
    }
}

   
    

