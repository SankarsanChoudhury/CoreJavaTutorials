package InterviewQuestions4;

public class DecimalToBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		long binary=convertDecimalToBinary(156);
		System.out.println(binary);

	}
	
	public static long convertDecimalToBinary(int n) {
		
		long binaryNumber=0;
		int remainder=1;
		int i=1;
		
		while(n!=0) {
			remainder=n%2;
			n=n/2;
			binaryNumber +=remainder*i;
			i*=10;
		}
		return binaryNumber;
	}

}
