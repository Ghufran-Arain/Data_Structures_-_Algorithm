/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DSA_LAB_06;
  import java.util.Arrays;
public class Leet_Code_03_Task {
     static int temp[]=new int[10];
       static int t=0;
    public int[] intersect(int[] nums1, int[] nums2) {
      
        for(int i=0; i<nums1.length; i++){
            for(int j=0; j<nums2.length; j++){
                if(nums1[i]==nums2[j]){
                     temp[t++]=nums1[i];
                     nums2[j]=Integer.MAX_VALUE; 
                    break;
                     
                }
              
            }
            
        }
        
          return Arrays.copyOf(temp, t);
    }
    public static void main(String[] args) {
        Leet_Code_03_Task t1= new Leet_Code_03_Task();
        int nums1[]={4,9,5};
        int nums2[]={9,4,9,8,4};
        
      int intersect[]=t1.intersect(nums1, nums2);
        System.out.println(Arrays.toString(intersect));
        
        
    }
  
}
