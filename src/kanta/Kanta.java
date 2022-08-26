package kanta;

public class Kanta {

	public static void main(String[] args) {
		// Reverse a the numbers: 1, 5, 7, 0, 2
		int [] numbers= {1,5,7,0,2};
        for(int i=numbers.length-1; i>=0; i--) {
       	System.out.println("Reverse: "+numbers[i]);
        }
	}

}
