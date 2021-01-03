package OOPSConcept_Part1;

class A1{
	public void m1() {
		System.out.println("A1");
		
	}
}

class B1 extends A1{
	
	public void m1() {
		System.out.println("B1");
	}
}

class C1 extends B1{
	public void m1() {
		System.out.println("C1");
	}
}


public class UpcastingDowncasting_Example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		C1 c=new C1();
		c.m1();
				
		((B1)c).m1();//Method m1() of B class
		((A1)((B1)c)).m1();//Method m1() of A class

	}

}
