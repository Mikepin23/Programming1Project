package Project_1;

import java.util.Random;
import java.util.Scanner;

public class Question_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner kb = new Scanner(System.in);
		Random rand = new Random();
		
		System.out.println("Please enter an integer for the rows: ");
		int row = kb.nextInt();
		
		System.out.println("Please enter an integer for the columns: ");
		int col = kb.nextInt();
		
		int i;
		int j = 0;
		
		int[][] array = new int [row][col];
		
		// Plugging random numbers in the indexes
		for(i = 0; i < row; i++) {
			for (j = 0; j < col; j++) {
				array[i][j] = rand.nextInt(101);
			}
		}
		
		// Printing the matrix
		for(i = 0; i < row; i++) {
			for (j = 0; j < col; j++) {
				System.out.printf("%4d", array[i][j]);
			}
			System.out.println();
			}
		
		System.out.println("Which number would you like to see dissapear?");
		int dis = kb.nextInt();
		
		// Switching the user input to 0
		for(i = 0; i < row; i++) {
			for (j = 0; j < col; j++) {
				if (array[i][j] == dis) {
					array[i][j] = 0;
					}
			}
		}
		
		System.out.println("Here is the modified version: ");
		
		// Printing the new matrix
		for(i = 0; i < row; i++) {
			for (j = 0; j < col; j++) {
				System.out.printf("%4d", array[i][j]);
			}
			System.out.println();
			}
		
		kb.close();

	}

}
