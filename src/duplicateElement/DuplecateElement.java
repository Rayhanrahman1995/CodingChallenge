package duplicateElement;

import java.util.HashSet;

public class DuplecateElement {

	public static void main(String[] args) {
		// HashSet
		HashSet<String> elements=new HashSet<>();
		elements.add("Java");
		elements.add("Python");
		elements.add("Java");
		System.out.println(elements);

	}

}
