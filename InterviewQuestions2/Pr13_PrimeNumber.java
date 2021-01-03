package InterviewQuestions2;

import java.util.Scanner;

public class Pr13_PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Prime Number is a number which is divisible by 1 and itself
		//0 and 1 is not a prime number
		//2 is the lowest prime number
		
		System.out.println("Enter the number to be erified prime or not.");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		
		boolean flag=false; //0 is false and 1 is true
		
		if(num==0||num==1) {
			
			System.out.println(num+" is not a prime number.");
		}
		else {
		
		for(int i=2;i<=num/2;i++) {
			
			if(num%i==0) {
				flag=true;  //flag=1
				break;
			}
			
		}
		
		if(flag==false) {
			System.out.println(num+ " is a prime number.");
			
		}else
		{
			System.out.println(num+" is not a prime number.");
			
		}
		
		}

	}

}
