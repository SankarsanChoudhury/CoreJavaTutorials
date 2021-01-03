package InterviewQuestions1;

public class Pr8_VowelOrConsonant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// a e i o u
		
		
		 char ch='i';
		 /*
		
		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
			
			System.out.println("The character "+ch+ " is a vowel.");
		}else
		{
			System.out.println("The character "+ch+" is a consonant.");
		}
		*/
		
		
		
		//Using switch Statement
		switch(ch) {
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
			System.out.println("The character "+ch+ " is a vowel.");
			break;
			
		default:
			System.out.println("The character \"+ch+\" is a consonant.");
			break;
		
		}

	}

}
