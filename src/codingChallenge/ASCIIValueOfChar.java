package codingChallenge;

public class ASCIIValueOfChar {

	public static void main(String[] args) {
		
		char value='a';
		int asciiValue=value;
		
		System.out.println("ASCII VALUE OF "+value+" is: "+asciiValue);
		asciiValue('A');
		asciiVal('2');
	}
	public static int asciiValue(char a) {
		char value=a;
		int asciiVal=value;
		System.out.println("ASCII VALUE OF "+value+" IS: "+asciiVal);
		return asciiVal;
	}
	public static int asciiVal(char a) {
		char val=a;
		int ascii=(int)val;
		System.out.println("ASCII VALUE OF "+val+" IS: "+ascii);
		return ascii;
	}

}
