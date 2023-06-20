package Project_1;

import java.util.Scanner;

public class Question_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Enter 3 2-digit numbers: ");
		int n1 = kb.nextInt();
		int n2 = kb.nextInt();
		int n3 = kb.nextInt();
		
		int sum = n1 + n2 +n3;
		
		if (sum % 3 == 0 && sum % 5 != 0) {
			System.out.println("Your magic number is " +  ((n2 / 10 * 100) + n1 + n3));
		} else if (sum % 3 != 0 && sum % 5 == 0) {
			System.out.println("Your magic number is " + (((n1 + n3) * 10) + n2 % 10));
		} else if (sum % 3 == 0 && sum % 5 == 0) {
			System.out.println("Your magic number is " + n2 + n1 + 1);
		} else {
			System.out.println("Your magic number is " + n1 + n2 + n3);
		}
		
		kb.close();

	}

}
