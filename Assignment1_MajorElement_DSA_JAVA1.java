//Created by SUPARNA DAS

// Lets Upgrade Assignment  DAY 2 

// DSA JAVA Major Element

import java.util.Scanner;
 
class MajorNumber {
    
    static void major_element(int arr[], int n)
    {
       
        int highCount = 0;
        int initial_index = -1; 
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (arr[i] == arr[j])
                    count++;
            }
 
         
            if (count > highCount) {
                highCount = count;
                initial_index = i;
            }
        }
 
    
        if (highCount > n / 2)
            System.out.println(arr[initial_index]);
 
        else
            System.out.println(-1);
    }
 
  
    public static void main(String[] args)
    {
   Scanner sc=new Scanner(System.in);  
       int[] arr = new int[10];
        for(int i=0; i<10; i++)  
        {  
                arr[i]=sc.nextInt();  
        }  
        
        int n = arr.length;
 
   
        major_element(arr, n);
    }

}
