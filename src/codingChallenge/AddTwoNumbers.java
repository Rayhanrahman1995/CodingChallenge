package codingChallenge;

public class AddTwoNumbers {

	public static void main(String[] args) {
		
		// ADD TWO NUMBERS
		int a=10;
		int b=20;
		int sum=a+b;
		System.out.println("Sum of two numbers: "+sum);	
		sum(20,30);
		
	}
	public static int sum(int a,int b) {
		int total=a+b;
		System.out.println("The sum of "+a+" and "+b+" is: "+total);
		return total;
	}

}
