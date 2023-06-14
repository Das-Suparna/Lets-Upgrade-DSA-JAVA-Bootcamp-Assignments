// Created by Suparna 
// Day 2 
//  Find All Duplicates in an Array

class duplicateElement {
    public static void main(String[] args) {
         
        int [] arr = new int [] {0, 5, 10, 4, 5, 7, 1, 1, 10};   
       
        for(int i = 0; i < arr.length; i++) {  
            for(int j = i + 1; j < arr.length; j++) {  
                if(arr[i] == arr[j])  
                    System.out.print(arr[j] + " ");  
            }  
        }  
    }
}
