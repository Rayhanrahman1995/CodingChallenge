package secondLargest;

import java.util.Arrays;

public class SecondLargest {
	/*
	   How do we find second largest Number in list ?
	   Analyze the coding Assignment:>>>
	 1. We must iterate through into entire list.
	 2. Keep track of the second highest number.
	 3. Keep track of the highest number.
	 4. How to store the value of the above numbers as we iterate through the list.
	Steps:
	    We have to declare two variables here.
	    int largestNum=0;
	    int secondLargestNum=0;
	*/

	public static void main(String[] args) {
		// Create 2 variables to hold largest and second largest numbers.
		int largestNum=0;
	    int secondLargestNum=0;
	    // An array that holds the numbers.
	    int[] numbers= {9,2,1,60,59,47};    
	    
        for(int i=0;i<numbers.length;i++) {
        	if(numbers[i] > largestNum) {
        		secondLargestNum=largestNum;
        		largestNum=numbers[i];
        	} else if(numbers[i] > secondLargestNum) {
        		secondLargestNum=numbers[i];
        	}
        }
        System.out.println(Arrays.toString(numbers));
        System.out.println(secondLargestNum);
        System.out.println(largestNum);
	}
}
