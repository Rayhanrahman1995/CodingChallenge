package anik;

public class CountSumOfDigit {

	public static void main(String[] args) {
		int num=123;
		int sum=0;
		
		while(num>0) {
			sum=sum+num%10; //3+2+1
			num=num/10;//12 1 0
		}
        System.out.println("Sum Numbers: "+sum);
	}

}
