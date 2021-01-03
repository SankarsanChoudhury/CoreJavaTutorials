package OOPSConcept_Part1;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//It will compile successfully. However it will throw Runtime error
		//Exception in thread "main" java.lang.ClassCastException: class java.lang.String cannot be cast to class java.lang.StringBuffer (java.lang.String and java.lang.StringBuffer are in module java.base of loader 'bootstrap')
		Object o=new String("Sankarsan");
		StringBuffer sb=(StringBuffer)o;
		System.out.println(sb);
		
		

	}

}
