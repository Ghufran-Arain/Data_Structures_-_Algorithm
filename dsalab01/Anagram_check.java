/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dsalab01;
import java.util.Arrays;
import java.util.Scanner;
public class Anagram_check {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter First String: ");
        String str1=sc.nextLine();
        System.out.println("Enter Second String: ");
        String str2=sc.nextLine();
        String temp1=str1.toLowerCase();
        String temp2=str2.toLowerCase();
         if(temp1.length()!=temp2.length()){
            System.out.println("The strings are not anagrams.");
            return;
         }
        char[] arr1=temp1.toCharArray();
        char[] arr2=temp2.toCharArray();
       Arrays.sort(arr1);
       Arrays.sort(arr2);
       if(Arrays.equals(arr1, arr2)){
           System.out.println("Strings are Anagrams: ");
       }else{
           System.out.println("Strings are not Anagrams: ");
       }
        
    }
 
}
