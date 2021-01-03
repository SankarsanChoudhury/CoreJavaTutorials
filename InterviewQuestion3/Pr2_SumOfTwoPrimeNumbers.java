package InterviewQuestion3;

public class Pr2_SumOfTwoPrimeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Program to check whether a number can be expressed as a sum of 2 prime numbers
	
	System.out.println(checkPrimeNumber(17));

	}

	public static boolean checkPrimeNumber(int num) {
		boolean isPrime=true;
		for(int i=2;i<num/2;i++) {
			if(num%2==0) {
				isPrime=false;
				break;
			}
		}
		
		return isPrime;
	}
}
