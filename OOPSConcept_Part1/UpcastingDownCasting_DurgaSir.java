package OOPSConcept_Part1;

class Base1{}
class Base2{}
class Der1 extends Base1{}
class Der2 extends Base1{}
class Der3 extends Base2{}
class Der4 extends Base2{}

public class UpcastingDownCasting_DurgaSir {
	
	//A b=(C)d
	//Rule1-(At Compile Time):The type of 'd' and 'C' must have some relationship(either parent to child or child to parent or same type),otherwise we will get compile time error.
	//Rule2-(At Compile Time):'C" must be either same or derived type of 'A',otherwise we will get compile time error.
	//Rule3-(At Runtime)-The underlying original object type of 'd' must be either same or derived type of 'C', otherwise we will get runtime exception saying :ClassCastException
	
	//Important- In typecasting no new object is created. Only new reference variables will refer to the same object.
	public static void main(String args[]) {
		
		Base2 b=new Der4();
		
		Der4 d=(Der4)b;
		
		Base1 b1=(Base1)b; //Compile time Error as b and Base1 does not have any relation
		Base2 b2=(Base2)b;
		Object o=(Der3)b; //No Compiletime Error. However Runtime Error as underlying object 'b' i.e new Der4() must be either same or derived type of 'Der3'->`This condition is not met.
		Base2 b3=(Base1)b;//Compile time Error as b and Base1 does not have any relation
		
	}

}
