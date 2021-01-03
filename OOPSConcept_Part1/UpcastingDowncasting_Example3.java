package OOPSConcept_Part1;

class A2{
	public static void m1() {
		System.out.println("A2");
		
	}
}

class B2 extends A2{
	
	public static void m1() {
		System.out.println("B2");
	}
}

class C2 extends B2{
	public static void m1() {
		System.out.println("C2");
	}
}

public class UpcastingDowncasting_Example3 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		C2 c=new C2();
		c.m1();
				
		((B2)c).m1();//Method m1() of B class
		((A2)((B2)c)).m1();//Method m1() of A class


	}

}
