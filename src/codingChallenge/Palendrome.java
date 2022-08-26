package codingChallenge;

public class Palendrome {

	public static void main(String[] args) {
	System.out.println(getPalendrome(121));

	}
	// 121%10=1
	// 121/10=12;
	public static int getPalendrome(int num) {
		int reverse=0;
		int actual=0;
		int results=num;
		
		while(num<0) {
			reverse=reverse%10;  //1
			num=num%10; // 12
			actual=actual*10+reverse;
		}
		return actual;
		
	}

}
