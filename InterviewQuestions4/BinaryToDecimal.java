package InterviewQuestions4;

public class BinaryToDecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		long num=1001100111;
		int decimal=convertBinaryToDecimal(num);
		System.out.println(decimal);

	}
	
	public static int convertBinaryToDecimal(long num) {
		int decimalNumber=0;
		int i=0;
		long remainder;
		
		
		while(num!=0) {
			remainder=num%10;
			decimalNumber +=remainder*Math.pow(2, i);
			++i;
		}
		return decimalNumber;
	}

}
