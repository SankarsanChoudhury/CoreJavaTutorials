package InterviewQuestions2;

public class Pr11_PowerOfANumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//3^4=81 and 2^0=1
		int base=3;
		int exponent=4;
		
		long result=1;
		
		while(exponent!=0) {
		
			result *=base; //result*base
			--exponent;
		}
		
		System.out.println(result);
		
		System.out.println(Math.pow(base,exponent)); //You can achieve with Math class & pow function

	}

}
