package InterviewQuestions2;

import java.util.Scanner;

public class Pr10_ReverseANumber {
	
	public static void main(String args[]) {
		
		System.out.println("Enter the number to be reversed:");	//Lets enter 1234
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int rev=0;
		int n=0;
		
		while(num!=0) {
			
			n=num%10; //1234%10=4  123%10=3
			rev=(rev*10)+n; //4 3
			num=num/10; //1234/10=123
					
		}
		
		System.out.println("Reversed number is:"+rev);
		
		//2.Using StringBuffer method
		long num1=123456;
		System.out.println(new StringBuffer(String.valueOf(num1)).reverse());
		
	}
	
}
