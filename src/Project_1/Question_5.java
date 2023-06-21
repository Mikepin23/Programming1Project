package Project_1;

import java.util.Arrays;

public class Question_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] nums = {2, 9, 8, 2, 7, 2, 2, 4, 2};
		
		System.out.print("Input: nums = " + Arrays.toString(nums));
		
		int majorityElement = majorityElement(nums);

        System.out.println("\nOuput: " + majorityElement);
    }

    public static int majorityElement(int[] nums) {
        int majorityElement = nums[0];
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == majorityElement) {
                count++;
            } else {
                count--;
                if (count == 0) {
                    majorityElement = nums[i];
                    count = 1; 
                }
            }
        }

        return majorityElement;
    }
}