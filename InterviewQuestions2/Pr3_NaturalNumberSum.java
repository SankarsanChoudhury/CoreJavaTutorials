//This program will calculate the sum of all the natural numbers
//If user enters 100 then it will be calculated as 1+2+3+......+100
//If user enters 5 it will be calculated as 1+2+3+4+5

package InterviewQuestions2;

import java.util.Scanner;

public class Pr3_NaturalNumberSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Please enter the number: ");
		
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int sum=0;
		int sum1=0;
		
		for(int i=0;i<=num;i++) {
			
			sum=sum+i;
		}
		
		System.out.println("The sum of "+num+ " is "+sum);
		System.out.println("----Sum of n numbers using while loop-----");
		
		int k=1;
		while(k<=num) {
			sum1=sum1+k;
			k++;
		}
		
		System.out.println("Sum is: "+sum1);

	}

}
