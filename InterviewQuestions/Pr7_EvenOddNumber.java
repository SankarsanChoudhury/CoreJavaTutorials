package InterviewQuestions;

import java.util.Scanner;

public class Pr7_EvenOddNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner reader=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num=reader.nextInt();
		
		if(num%2==0) {
			System.out.println("The number "+num+" is an even number.");
			}
		else {
			System.out.println("The number "+num+" is an odd number.");
		}

	}

}
