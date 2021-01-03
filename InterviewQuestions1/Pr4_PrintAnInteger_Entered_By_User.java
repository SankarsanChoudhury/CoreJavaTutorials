package InterviewQuestions1;

import java.util.Scanner;

public class Pr4_PrintAnInteger_Entered_By_User {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner reader=new Scanner(System.in);
		System.out.println("Please enter a number:");
		int num=reader.nextInt();
		
		System.out.println("The number you entered is:"+num);

	}

}
