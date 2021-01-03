package InterviewQuestions2;

public class Pr7_FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//0 1 1 2 3 5 
		//Suppose upto 10 times we have to do that
		
		int num=20; //10th num to be shown
		int t1=0;
		int t2=1;
		
		for (int i=1;i<=num;i++) {
			
			System.out.println(t1);
			int sum=t1+t2;
			t1=t2;
			t2=sum;
		}
		

	}

}
