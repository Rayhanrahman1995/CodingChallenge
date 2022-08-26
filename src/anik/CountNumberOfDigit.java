package anik;

public class CountNumberOfDigit {

	public static void main(String[] args) {
		// Count Number of digits 
		int numbers=92385;
		int count=0;
		
		while(numbers>0) {
			numbers=numbers/10; // 92, 9
			count++; // 1,2,3
		}
       System.out.println("How many numbers of digit: "+count);
	}

}
