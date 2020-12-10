package javaBasics;

public class Pr4_For_And_While_Loops {
	
	public static void main(String args[]) {
		
		//To print a sequence repeatedly we use for loop
		//1.While loop
		//Disadvantage of while loop-It will generate infinite loop if you dont give incremental/decremental part
		
		int i=1; //initialization
		while (i<=10)//condition
		{			
			System.out.println(i);
			i=i+1; //incremental/decremental/iteration
			//If we don't write the statement then i will keep on printing as 1 and we have to terminate the program
			}
		
		
		for(int j=100;j<=110;j++) {
			System.out.println("Value of j is: "+j);
			}
		
		
		//print 10 to 1 using for loop
		for(int k=10;k>=1;k--) {
			
			System.out.println("Value of k is: "+k);
			
		}
		
		
	}

}
