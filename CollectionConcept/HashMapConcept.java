package CollectionConcept;

import java.util.HashMap;
import java.util.Map;

public class HashMapConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<String,Integer> marks=new HashMap<String,Integer>();
		marks.put("Naveen",100);
		marks.put("Tom",200);
		marks.put("Lisa", 300);
		marks.put("Peter",400);
		marks.put("Robby",600);
		
		marks.put(null, 500);
		//hashing: hashCode()-->hashing
		//hashCode() method is overridden by HashMap() class.hashCode() method is method of object class.
		
		System.out.println(marks.get("Lisa"));
		
		//Pseudo code of get() method
		//First it will calculate the hashcode of Lisa  e.g. hashcode=210678
		//Then based on the hashcode it will find the index e.g. index=15
		//The .equals() method checks the key name in the node
		//if it matches with Lisa then it returns the value for Lisa

	}

}
