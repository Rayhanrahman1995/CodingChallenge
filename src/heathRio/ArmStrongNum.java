package heathRio;

public class ArmStrongNum {

	public static void main(String[] args) {
         armStrong(153);
	}
	
	public static void armStrong(int num) {
		int remainder;
		int total=0;
		
		while(num>0) {
			remainder=num%10;
			num=num/10;
			total=total+remainder*remainder*remainder;
		}
		if(total==num) {
			System.out.println("THE NUMBER OF IS ARMSTRONG NUMBER");
		} else {
			System.out.println("THE NUMBER IS NOT ARMSTRONG");
		}
	}

}
