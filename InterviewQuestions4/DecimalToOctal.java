package InterviewQuestions4;

public class DecimalToOctal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(convertDecimalToOctal(78));

	}
	
	public static int convertDecimalToOctal(int decimal) {
		
		int octalNumber=0;
		int i=1;
		while(decimal!=0) {
			octalNumber+=(decimal%8)*i;
			decimal/=8;
			i*=10;
		}
		return octalNumber;
	}

}
