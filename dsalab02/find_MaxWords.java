/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dsalab02;

public class find_MaxWords {
    public static void main(String[] args) {
        String[] sentences={
            "My name is Ghufran",
            "My degree program is A.I",
            "I am Student of Aror University"};
        
        int maxWords=0;
        for(String sentence:sentences){
            String[]words=sentence.split(" ");
            if(words.length>maxWords){
                maxWords = words.length;}}
        System.out.println(maxWords);}}


