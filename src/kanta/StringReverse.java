package kanta;

public class StringReverse {

	public static void main(String[] args) {	
		String name="John";
		for(int i=name.length()-1;i>=0;i--) {
		 System.out.println("Reverse Value: "+name.charAt(i));
		}
	}
}
