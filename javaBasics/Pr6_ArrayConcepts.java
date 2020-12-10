package javaBasics;

//Advantages of Array
//You can store multiple same type of values in a single variable

//Disadvantage
//Static Array. Size is fixed. you can't go beyond the length
//It stores similar data types. If you are declaring integer/string/character you can store the respective values only
//To overcome the above problem we use object Array i.e Collection

public class Pr6_ArrayConcepts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i=10;
		i=20; //Here value of i will be replaced by 20 as at a time we can assign only one value to a variable
		
		//Array concept is used to store similar data types
		int i1[]=new int[4];
		i1[0]=10;
		i1[1]=20;
		i1[2]=30;
		i1[3]=40;
		//It will not show an warning or error. However when you run the program the below exception occurs
		//Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 4
		//i1[4]=50;
		//i1[5]=60;
		//lower bound /index=0
		//upper bound/index=(n-1) where n=size of Array
		
		System.out.println(i1[2]);
		System.out.println(i1.length);
		
		//print all the values of array
		for(int j=0;j<i1.length;j++) {
			System.out.println("Value present at "+ j+"th index"+" of Array i1 is: "+i1[j]);
		}
		
		//Double Array
		double d[]=new double[3];
		d[0]=10.11;
		d[1]=11.12;
		d[2]=11.22;
		System.out.println(d[2]);
		
		//Character Array
		char c[]=new char[4];
		c[0]='a';
		c[1]=2;
		c[2]='#';
		
		
		//Boolean array
		boolean b[]=new boolean[2];
		b[0]=true;
		b[1]=false;
		
		//String Array
		String s[]=new String[3];
		s[0]="Sankarsan";
		s[1]="Subhasmita";
		s[2]="Manmita";
		System.out.println(s.length);
		
		
		//Object Array
		//Object is the super class of all the classes
		//Object Array is used to store different data type
		Object obj[]=new Object[6];
		obj[0]=100;
		obj[1]="Sankarsan Chouhury";
		obj[2]=10000.54;
		obj[3]='M';
		obj[4]="Pune";
		System.out.println(obj[4]);
		System.out.println("Size of obj Array is "+obj.length);
				
				
				

	}

}
