package sdet;

public class CountCharacterOccurance {
	public static void main(String[] args) {
	String s="Java Programming Java oops";
	int total=s.length();
	System.out.println("Total characters: "+total);
	
	int totalAfter_a=s.replace("J","").length();
	System.out.println("Total characters After 'J': "+totalAfter_a);
	
	int count_a=total-totalAfter_a;
	System.out.println("Total characters 'J': "+count_a);
	}

}
