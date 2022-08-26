package noyon;

import java.util.Arrays;

public class Interview6 {
	
	public static void main(String[] args){
        String original = "jyz5wlq9c3m80";
        char[] chars = original.toCharArray();
        Arrays.sort(chars);
        String sorted = new String(chars);
        System.out.println(sorted);
    }
}
