package noyon;

import java.util.HashMap;
import java.util.Map;

public class Interview {

	public static void main(String[] args) {
		MyClass1 obj1 = new MyClass1(); 
		MyClass2 obj2 = new MyClass2(); 
		
		Map<Object, Object> hMap = new HashMap<>(); 
		hMap.put(obj1, obj1); 
		hMap.put(obj2, obj1); 
		System.out.println("size=" + hMap.size());
		
		 } 
}
