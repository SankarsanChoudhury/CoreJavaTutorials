//String is a class in Java

package javaBasics;

public class Pr2_StringMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String FirstName="Sankarsan";
		String LastName="Choudhury";
		
		int x=10;
		int y=20;
		
		System.out.println(FirstName+LastName);
		System.out.println(FirstName+LastName+x+y); //SankarsanChoudhury1020
		System.out.println(x+y+FirstName+LastName); //30SankarsanChoudhury
		System.out.println(FirstName+LastName+(x+y));//SankarsanChoudhury30
		System.out.println(x+y+FirstName+LastName+x+FirstName+y+LastName);//30SankarsanChoudhury10Sankarsan20Choudhury
		
		System.out.println("The value of x is: "+x);
		System.out.println("The value of y is: "+y);
		
		double a=100.21;
		double b=200.22;
		
		System.out.println("The sum of a and b is: "+(a+b));
		
		
		
		

	}

}
