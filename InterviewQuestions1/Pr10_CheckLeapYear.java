package InterviewQuestions1;

import java.util.Scanner;

public class Pr10_CheckLeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//divisible by 4 for all the century years-- ending with 00
		//Century year(1800,1900,2000) is a leap year only when it is perfectly divisible by 400
		
		//1900 is not a leap year as it is divisible by 4 but not divisible by 400
		//2012 is a leap year as it is divisible by 4
		
		
		
		Scanner sc=new Scanner(System.in);
		int year=sc.nextInt();
		
		boolean leap=false;
		
		if(year % 4 == 0 ) {
			if(year % 100 == 0) {
				if(year % 400 == 0) {
					leap=true;
				}else{
					leap=false;
				}
			}
			else {
					leap=true;
				}
			}else {
				leap=false;
			}
			
			if(leap) {
				System.out.println(year + " is a leap year.");
				}
			else {
				System.out.println(year+" is not a leap year");
				
			}
		

	}

}
