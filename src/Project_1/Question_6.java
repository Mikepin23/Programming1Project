package Project_1;

import java.util.Arrays;

public class Question_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		   int[] nums = {2, 5, 0, 4, 1};

		   System.out.print("Input: nums = " + Arrays.toString(nums));
		  
		   int missingNumber = missingNumber(nums);
	        
	        System.out.println("\nOutput: " + missingNumber);
	    }
	    
	    public static int missingNumber(int[] nums) {
	        int n = nums.length;
	        
	        int equatedSum = (n * (n + 1)) / 2;
	        
	        int numsSum = 0;
	        for (int el : nums) {
	            numsSum += el;
	        }
	        return equatedSum - numsSum;
	    }
	}