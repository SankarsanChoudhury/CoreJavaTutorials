package OOPSConcept_Part1;

class P{
	public void m1() {
		System.out.println("Parent");
	}
}

class C extends P{
	public void m2() {
		System.out.println("Child");
	}
}

public class UpcastingDowncasting_Example {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		C c=new C();
		c.m1();
		c.m2();
		((P)c).m1();
		((P)c).m2(); //CE---The method m2() is undefined for type P i.e. for class P 

	}

}
