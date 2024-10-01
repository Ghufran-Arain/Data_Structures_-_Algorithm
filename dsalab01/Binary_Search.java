/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dsalab01;

public class Binary_Search {
    public static void  main(String[] args) {
        int [] arr={2,4,6,8,10};
        int low=0;
        int high=arr.length-1;
        int target=8;
        int result=-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]==target){
                result= mid;
                break;
            }
            if(arr[mid]<target){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        if(result==-1){
            System.out.println("Element not found:");
        }else{
            System.out.println("Element "+arr[result]+" found at index : "+result);
        }
        
        
    }
}
