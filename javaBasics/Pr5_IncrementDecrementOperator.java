package javaBasics;

public class Pr5_IncrementDecrementOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//++
		//--
		
		int i=1;
		System.out.println("Value is i is: "+i); //1
		
		int j=i++; //post increment.First i will be assigned to j. Then i will be incremented.
		
		System.out.println("Value of i is: "+i); //2
		System.out.println("Value of j is: "+j); //1
		
		//Preincrement
		int a=1;
		System.out.println("Value of a is: "+a); //Value of a is: 1
		int b=++a;
		System.out.println("Value of a is: "+a); //Value of a is: 2
		System.out.println("Value of b is: "+b); //Value of b is: 2
		
		//Postdecrement
		int m=10;
		System.out.println("Value of m is :"+m);
		int n=m--;
		System.out.println("Value of m is: "+m);
		System.out.println("Value of n is :"+n);
				

	}

}
