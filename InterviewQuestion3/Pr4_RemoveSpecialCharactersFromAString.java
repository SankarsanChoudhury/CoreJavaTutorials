package InterviewQuestion3;

public class Pr4_RemoveSpecialCharactersFromAString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//By using regular expression you can remove the junk characters from a string
		
		String s="%^$*&%^%^&sankarsan";
		
		String s1=s.replaceAll("[^a-zA-Z0-9]","");
		System.out.println(s1);

	}

}
