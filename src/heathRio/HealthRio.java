package heathRio;

public class HealthRio {

	public static void main(String[] args) {
		factorialNum(5);
	}
	public static void factorialNum(int num) {
		int fact=1;
		
		for(int i=1;i<=num;i++) {
			fact=fact*i;
		}
		System.out.println("FACTORIAL NUMBER of "+num+" IS: "+fact);
	}
}
