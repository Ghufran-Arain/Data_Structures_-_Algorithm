/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dsalab02;

public class Prime_numbers {
    public static void main(String[] args) {
        
        int n=10;
        int primeCount=0;
        for(int num=2;num<n;num++){
            boolean isPrime=true;
            for(int i=2;i<num;i++){
                if(num%i==0){
                    isPrime=false;
                    break;}}
            if(isPrime){
                primeCount++;}}
        System.out.println("There are "+primeCount+" prime numbers less than 10:");
    }}


