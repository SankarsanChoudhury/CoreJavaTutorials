package InterviewQuestions2;

public class Pr5_ReverseAString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="Sankarsan";
		String rev="";
		int len=s.length(); //Length of the String
				
		
		for (int i=len-1;i>=0;i--) {
			
			rev=rev+s.charAt(i);
			//System.out.println(rev);
		}
		
		System.out.println("Reverse of string "+s+ " is: "+rev);
		
		//2.Using StringBuffer class you can use reverse() function and reverse the tring
		//You cant use reverse() function with STring as it is immutable
		
		StringBuffer sf=new StringBuffer(s);
		System.out.println(sf.reverse());

	}

}
