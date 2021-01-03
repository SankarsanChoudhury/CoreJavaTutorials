package InterviewQuestions2;

import java.util.Scanner;

public class Pr12_PallindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter the number to be checked as pallindrome or not:");
		
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int ReversedNumber=0;
		
		int ActualNum=num;
		
		while(num!=0) {
			
			int n=num%10;
			ReversedNumber=ReversedNumber*10+n;
			num=num/10;
		}
		
		System.out.println("The reversed number is: "+ReversedNumber);
		
		if(ActualNum==ReversedNumber) {
			System.out.println("The number "+ActualNum+" is a pallindrome number.");
		}
		else {
			System.out.println("The number "+ActualNum+" is not a pallindrome number.");
		}
			
		

	}

}
