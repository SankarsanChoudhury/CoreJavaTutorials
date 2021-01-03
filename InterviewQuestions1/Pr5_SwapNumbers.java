package InterviewQuestions1;

public class Pr5_SwapNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=10;
		int b=20;
		System.out.println("Before Swapping:");
		System.out.println("Value of "+a+" is "+a);
		System.out.println("Value of "+b+" is: "+b);
		
		//Logic by using a temp variable
		//int temp;
		//temp=a;
		//a=b;
		//b=temp;
		
		//Logic without using a temp variable
		a=a-b; //-10
		b=a+b;//(-10)+20=10
		a=b-a; //10-(-10)=10+10=20
		
		
		System.out.println("a= "+a);
		System.out.println("b= "+b);
		

	}

}
