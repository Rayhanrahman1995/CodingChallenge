package qa.palindrome;

public class PalindromeStringBuffer {

	public static void main(String[] args) {
		StringBuffer sBuffer=new StringBuffer("level");
		sBuffer.reverse();
		String value=sBuffer.toString();
		if(value.equals("level")) {
			System.out.println("palindrome");
		} else {
			System.out.println("Not palindrome");
		}

	}

}
