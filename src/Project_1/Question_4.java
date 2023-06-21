package Project_1;

import java.util.Arrays;

public class Question_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  
		int[] array = {5, 0, 10, 0, 15, 20, 0, 25, 5};     
        int temp = 0;
     
        System.out.println("Original array: " + Arrays.toString(array));   
            
        for (int i = 0; i <array.length; i++) {     
          for (int j = i + 1; j <array.length; j++) {     
              if(array[i] > array[j]) {     
                 temp = array[i];    
                 array[i] = array[j];    
                 array[j] = temp;    
               }     
            }  
        }   
        
        System.out.println("Sorted array: " + Arrays.toString(array));
		
	}
}
