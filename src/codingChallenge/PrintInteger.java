package codingChallenge;

import java.util.Scanner;

public class PrintInteger {

	public static void main(String[] args) {
		
// PRINT AN INTEGER ENTERED BY USERS ?
//		Scanner scanner=new Scanner(System.in);
//		System.out.println("Plz enter a number: ");
//		int number=scanner.nextInt();
//		System.out.println("I entered: "+number);
//		number(25);
		userNumber();
	}
	
	public static int number(int number) {
		System.out.println("My number is: "+number);
		return number;
	}
	public static int userNumber() {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Please enter a number: ");
		int myNum=scanner.nextInt();
		System.out.println("My number is: "+myNum);
		return myNum;
	}

}
