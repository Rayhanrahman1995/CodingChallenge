package qa.palindrome;

public class PalindromeNumber {

	public static void main(String[] args) {
		int number=120;
		int temporary=number;
		int remainder=0;
		int actual=0;
		
		while(number>0) {
			remainder=number%10; // 121%10 = 1
			number=number/10;  // 12
			 actual=actual*10+remainder;  // 1 , 2, 1
		}
         if(actual==temporary) {
        	System.out.println("Palindrome"); 
         } else {
        	 System.out.println("Not Palindrome");
         }
	}

}
