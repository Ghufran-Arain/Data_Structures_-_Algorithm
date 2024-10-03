/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DSA_LAB_06;
import java.util.Arrays;
public class Leet_Code_02 {
          public char findTheDifference(String s, String t) {
        char c1[]=s.toCharArray();
        char c2[]=t.toCharArray();
         Arrays.sort(c1);
         Arrays.sort(c2);
         for(int i=0; i<c1.length; i++){
             if(c1[i]!=c2[i]){
                 return c2[i];
             }
         }
        return c2[c2.length-1];
    }
    public static void main(String[] args) {
   
    }
}
