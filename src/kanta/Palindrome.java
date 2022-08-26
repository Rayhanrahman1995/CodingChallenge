package kanta;

public class Palindrome {

	public static void main(String[] args) {
		// level = level
		// 121   = 121
		// noyon = noyon
		String name="noyon"; // requirement/expected
		// String temp=name;    
		String actual="";   // actual
		
		for(int i=name.length()-1;i>=0;i--) {
			actual=actual+name.charAt(i);
		}
       
       if(actual.equals(name)) {
    	   System.out.println(actual+" is plaindrome"); 
       }else {
    	   System.out.println(actual+" is not plaindrome");
       }
	}

}
