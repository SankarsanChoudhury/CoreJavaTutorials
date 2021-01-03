package InterviewQuestions2;

import java.util.Scanner;

public class Pr1_PositiveNegativeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter the number to be checked:");
		Scanner sc=new Scanner(System.in);
		int number=sc.nextInt();
		
		
		sc.close();
		
		if (number>0.0) {
			System.out.println("The entered number "+number+ " is a positive integer.");
		}else if(number<0.0) {
			System.out.println("The entered number "+number+ " is a negative number.");
		}
		else {
			System.out.println("The entered number is zero");
		}

	}

}
