package kanta;

import java.util.HashSet;

public class RetrieveValue {

	public static void main(String[] args) {
		// value retrieve 
		HashSet<String> name=new HashSet<String>();
        name.add("Enthrall");
        name.add("IT");
        
    /*   Iterator it=name.iterator();
       while(it.hasNext()) {
        Object value=it.next();
        System.out.println("HashSet Value: "+value);
        }
	} */
        for(String value:name) {
        	System.out.println("value: "+value);
        }
	}
}
