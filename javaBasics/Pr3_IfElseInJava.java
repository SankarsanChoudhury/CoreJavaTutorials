package javaBasics;

public class Pr3_IfElseInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=10;
		int b=20;
		int c=30;
		
		if (a>b & a>c) //false & false=false
		
		{
			System.out.println("a is the greatest number.");
		}
		else if(b>c) //it will skip as this statement is not true i.e. b>c
		
		{
			System.out.println("b is the greatest number.");
			
		}
		else {
			System.out.println("c is the the greatest number.");
		}
		
		// Equal to operator == is used to check whether 2 no.s are equal or not
		
		int x=60;
		int y=70;
		if(x==y) {
			System.out.println("x is equal to y");
		}
		else {
			System.out.println("x is not equal to y");
		}
		

	}

}
