package InterviewQuestion3;

import java.util.Scanner;

public class Pr1_SumOfNnaturalNumbersUsingRecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter a number:");
		Scanner reader=new Scanner(System.in);
		int num=reader.nextInt();
		int sum=addNum(num);
		System.out.println("Sum is: "+sum);
		
		

	}
	public static int addNum(int num) {
		
		if(num!=0) {
			return num+addNum(num-1);
		}
		else {
			return num;
		}
	}

}
