package Project_1;

import java.util.Scanner;

public class Question_2_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner kb = new Scanner(System.in);

        System.out.println("Joker: ");
        int joker = kb.nextInt();

        System.out.println("Number: ");
        int numberCount = kb.nextInt();
        
        int number;
        
        System.out.println("Enter numbers: ");
        
        for (int i = 1; i <= numberCount; i++) {
        	number = kb.nextInt();
        	
        	if (number < joker) {
	        	System.out.print(0 + " ");
	        	continue;
        	} 
     
        	while (number >= joker) {
        		number -= joker;
        	} 
        	System.out.print(number + " ");
        } 
        
        kb.close();
 
	}

}
