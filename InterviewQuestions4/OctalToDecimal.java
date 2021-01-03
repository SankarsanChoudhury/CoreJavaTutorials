package InterviewQuestions4;

public class OctalToDecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(convertOctalToDecimal(65));

	}
	
	public static int convertOctalToDecimal(int octal) {
		int decimalNumber=0;
		int i=0;
		
		while(octal!=0) {
			decimalNumber+=(octal%10)*Math.pow(8, i);
			++i;
			octal/=10;
		}
		return decimalNumber;
	}

}
