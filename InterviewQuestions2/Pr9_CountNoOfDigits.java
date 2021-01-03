package InterviewQuestions2;
//Find no of integers in a number

public class Pr9_CountNoOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=1234;
		int count=0;
		
		while(num!=0) {
			num=num/10; //123 12 1 0
			++count; //1 2 3 4
			
		}
		System.out.println("Number of digits present are "+count);
		

	}

}
