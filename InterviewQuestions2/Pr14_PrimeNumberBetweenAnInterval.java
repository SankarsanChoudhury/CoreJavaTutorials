package InterviewQuestions2;

public class Pr14_PrimeNumberBetweenAnInterval {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Find prime numbers between a given inetrval
		
		int low=20;
		int high=50;
		while(low<high) {
			
			boolean flag=false;
			
			for(int i=2;i<low/2;i++) {
				
				if(low%i==0) {
					flag=true;
					break;
				}
			}
			
			if(!flag) {
				System.out.println(low+" ");
			}
			low++;
		}
		
		

	}

}
