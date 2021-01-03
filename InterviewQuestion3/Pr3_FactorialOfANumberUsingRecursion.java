package InterviewQuestion3;

import java.util.Scanner;

public class Pr3_FactorialOfANumberUsingRecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter the number:");
		
		Scanner reader=new Scanner(System.in);
		int num=reader.nextInt();
		int Factorial=multiplyNum(num);
		
		System.out.println("Factorial of a number "+num+ " is "+Factorial);

	}
	
	public static int multiplyNum(int num) {
		if(num>=1) {
			return num*multiplyNum(num-1);
		}
		else {
			return 1;
		}
	}

}
