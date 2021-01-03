package InterviewQuestion3;

public class Pr5_FindMissingNumberInAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//int a[]= {1,2,3,5}; //4 is missing
		//1+2+3+4+5=15
		//1+2+3+5=12
		//15-12=3
		
		int a[]= {-1,0,1,2,4,5,6,7,8,9,10};
		int sum=0;
		for(int i=0;i<a.length;i++) {
			sum=sum+a[i];//49
		}
		
		System.out.println(sum);
		
		int sum1=0;
		for(int j=-1;j<=10;j++) {
			sum1=sum1+j;
		}
		
		System.out.println(sum1);
		System.out.println("Missing number is:::"+(sum1-sum));
		
		

	}

}
