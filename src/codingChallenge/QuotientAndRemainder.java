package codingChallenge;

public class QuotientAndRemainder {

	public static void main(String[] args) {
		int dividend=30;
		int divisor=2;
		
		int quotient=dividend/divisor; // 6
		int remainder=dividend%divisor; // 0
		
		System.out.println("QUOTIENT IS: "+quotient);
		System.out.println("DIVISOR IS: "+remainder);
		
		quoAndDiv(20,5);

	}
	public static void quoAndDiv(int a,int b) {
		int quotient=a/b;
		int divisor=a%b;
		
		System.out.println("QUOTIENT IS: "+quotient);
		System.out.println("DIVISOR IS: "+divisor);
		
		

	}

}
