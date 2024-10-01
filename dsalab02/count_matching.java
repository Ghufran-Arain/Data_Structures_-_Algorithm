/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dsalab02;

public class count_matching {
    
    public static void main(String[] args){
        int[] nums1={4,3,2,3,1};
        int[] nums2={2,2,5,2,3,6};
        int count1=0; 
        int count2=0;
        for(int i=0; i<nums1.length;i++){
            for(int j=0; j<nums2.length;j++){
                if (nums1[i]==nums2[j]){
                    count1++;
                    break; }}}
        for(int i=0; i<nums2.length;i++){
            for(int j=0; j<nums1.length;j++){
                if(nums2[i]==nums1[j]){
                    count2++;
                    break;}}}
        System.out.print(count1+" ");
        System.out.println(count2);
    }
}


