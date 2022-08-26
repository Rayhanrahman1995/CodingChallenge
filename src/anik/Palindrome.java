package anik;

public class Palindrome {
	
	public static void main(String[] args) {
		String name="level";
		String rev="";
		String temp=name;
		
		for(int i=name.length()-1; i>=0; i--) {
			rev=rev+name.charAt(i);
		}
	   if(temp.equalsIgnoreCase(rev)) {
		   System.out.println("It is equals");
	   } else {
		   System.out.println("It is not equals");
	   }
	}
}
