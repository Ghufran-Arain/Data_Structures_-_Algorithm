/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dsalab01;
import java.util.Scanner;
public class Palindrome_task06 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter First String: ");
        String s1=sc.nextLine();
        String reversed=new StringBuilder(s1).reverse().toString();
        if(s1.equalsIgnoreCase(reversed)){
            System.out.println("String is Palindrome:");      
        }else{
            System.out.println("String is not Palindrome: ");
        }
}
}