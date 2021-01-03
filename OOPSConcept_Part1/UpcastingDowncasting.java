package OOPSConcept_Part1;

public class UpcastingDowncasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//It will compile successfully. However it will throw Runtime error
				//Exception in thread "main" java.lang.ClassCastException: class java.lang.String cannot be cast to class java.lang.StringBuffer (java.lang.String and java.lang.StringBuffer are in module java.base of loader 'bootstrap')
				Object o=new String("Sankarsan");
				//StringBuffer sb=(StringBuffer)o;
				//System.out.println(sb);
				
				//It will through compile time error as Cannot cast from String to StringBuffer
				String s=new String("Subhasmita");
				//StringBuffer sb1=(StringBuffer)s; 
				
				String s1=(String)o;
				System.out.println(s1);
				System.out.println(s1==o); //We will get 'true' as result as we have 2 reference variables 0 and s1 for the same String object "Sankarsan"
				
				//---------------------Example2---------------------
				
				//Here only one Integer object is there. 3 Reference variables are there i1, n1 and o1.
				Integer i1=new Integer(10);
				Number n1=(Number)i1;
				Object o1=(Object)n1;
				System.out.println(i1==n1);  // The operator == is used to compare reference variable
				System.out.println(o1==n1);

	}

}
