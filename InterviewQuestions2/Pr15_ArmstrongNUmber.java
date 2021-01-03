package InterviewQuestions2;

public class Pr15_ArmstrongNUmber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//153=1*1*1 + 5*5*5 +3*3*3
		//371
		
		int num=371;
		int ActualNum=num;
		double result=0;
		
		while(ActualNum !=0) {
			int n=ActualNum%10;
			result=result+Math.pow(n, 3);
			ActualNum=ActualNum/10;
		}
		
		if(result==num) {
			System.out.println(num+" is an armstrong number.");
		}else {
			System.out.println(num+" is not an armstrong number.");
		}
	}

}
