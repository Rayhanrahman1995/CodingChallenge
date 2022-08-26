package codingChallenge;

public class SwapTwoNumbers {

	public static void main(String[] args) {
		
		int a=10;
		int b=20;
		
		System.out.println("BEFORE SWAP:>>>> ");
		System.out.println("THE VALUE OF 'A' IS: "+a);
		System.out.println("THE VALUE OF 'B' IS: "+b);
		
		int tempValue;
	     tempValue=a;
		 a=b;
	     b=tempValue;
		
		System.out.println("AFTER SWAP:>>>> ");
		System.out.println("THE VALUE OF 'A' IS: "+a);
		System.out.println("THE VALUE OF 'B' IS: "+b);
		

	}

}
