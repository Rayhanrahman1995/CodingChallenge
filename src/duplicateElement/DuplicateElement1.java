package duplicateElement;

public class DuplicateElement1 {

	public static void main(String[] args) {
		
		String [] names= {"Java","Python","PHP","Python","C#"};
		
		for(int i=0; i<names.length; i++) {
			for(int j=i+1; j<names.length; j++) {
				if(names[i] == names[j]) {
					System.out.println("Element is Duplicate: "+ names[i]);
				}
			}
		}

	}

}
