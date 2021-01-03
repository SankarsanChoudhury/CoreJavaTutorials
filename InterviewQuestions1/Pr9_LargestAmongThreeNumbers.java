package InterviewQuestions1;

public class Pr9_LargestAmongThreeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x=100;
		int y=200;
		int z=50;
		
		if(x>y && x>z) {
			
			System.out.println("x is the largest number.");

	}
		else if (y>z) {
			System.out.println("y i the largest number.");
			
		}
		else {
			System.out.println("z is the largest number.");
		}
		
		
		//Using nested loop
		
		if(x>=y) {
			if(x>=z) {
				System.out.println("x is the greatest");
			}
			else {
				System.out.println("z is the greatest number");
			}
		}
			else {
				if(y>=z) {
					System.out.println("y is the greatest");
				}
				else {
					System.out.println("z is the greatest.");
				}
			}
		}
	}


