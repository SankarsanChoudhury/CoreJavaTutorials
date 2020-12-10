package OOPSConcept_Part1;

//Class is a logical entity where we have to define the properties i.e the characteristics of the class
//Variables and Methods are the properties of the class

public class Pr1_FirstClass_Car {
	
	//Global variables
	int model;
	int wheel;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//One object will be created in java memory and car1 is the reference variable
		//new Car()- This is the object of car class
		//object reference must be unique
		Pr1_FirstClass_Car a=new Pr1_FirstClass_Car();
		Pr1_FirstClass_Car b=new Pr1_FirstClass_Car();
		Pr1_FirstClass_Car c=new Pr1_FirstClass_Car();
		
		a.model=2015;
		a.wheel=4;
		
		b.model=2019;
		b.wheel=4;
		
		c.model=2020;
		c.wheel=4;
		
		//Before assigning the reference
		
		System.out.println(a.model);
		System.out.println(a.wheel);
		
		System.out.println(b.model);
		System.out.println(b.wheel);
		
		System.out.println(c.model);
		System.out.println(c.wheel);
		
		
		//AFter shifting the references
		//a=b  --->Here a is referring to b. So noone is refining to a now.
		//b=c --->Here b is referring to c. 
		//c=a -->c is referencing to a.(However we know since a is referring to b. So c will also refer to b)
		
		// So none is referring to a. Both a and c is referring to b . b is referring to c
		
		a=b;
		b=c;
		c=a;
		
		a.model=10;
		System.out.println(a.model);
		c.model=20;
		System.out.println(a.model);
		
		
		
	}

}
