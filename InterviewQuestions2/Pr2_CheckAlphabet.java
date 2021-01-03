package InterviewQuestions2;

import java.util.Scanner;

public class Pr2_CheckAlphabet {
	
	public static void main(String args[]) {
		
		System.out.println("Please enter a character:");
		
		Scanner sc=new Scanner(System.in);
		char ch=sc.next().charAt(0);
		
		if((ch >= 'a' && ch<='z') ||(ch>='A' && ch<='Z')) {
			
			System.out.println("The entered character "+ch+" is an alphabet");
			}else {
				System.out.println("The entered character "+ch+" is not an alphabet.");
			}
		
	}
	
	

}
