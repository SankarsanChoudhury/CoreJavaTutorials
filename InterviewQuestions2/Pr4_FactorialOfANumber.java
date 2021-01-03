//5!=5*4*3*2*1
//Factoril of 0 is 1
package InterviewQuestions2;

import java.util.Scanner;

public class Pr4_FactorialOfANumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the number:");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		
		getFact(5); //call the method
		
	}
		
		public static void getFact(int num) {
			int fact=1;
			
			for(int i=1;i<=num;i++) {
				
				fact=fact*i;
				}
			
			System.out.println("Factorial of "+num+ " is: "+fact);
					
	}

}
