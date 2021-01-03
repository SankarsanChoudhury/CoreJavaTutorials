package InterviewQuestions2;

import java.util.Scanner;

public class Pr6_GenerateMultiplicationTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter the number for which you want to generate multiplication table:");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		
		for(int i=1;i<=10;i++) {
			
			System.out.println(num+ " x "+i+ " = "+(num*i));
		}

	}

}
