/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dsalab02;

public class index_Character {
 
    public static void main(String[] args) {
        String[]words={"leet","code"};
        char x='c';
        int count=0;
        for(String word:words){
            if(word.indexOf(x)!=-1){
                count++;
            }}
        int[] result=new int[count];
        int index=0;
        for(int i=0; i<words.length; i++){
            if(words[i].indexOf(x)!=-1){
                result[index++]=i;}}
        for(int i:result){
            System.out.print("index is "+i+" ");}}}
  

