package javaBasics;

public class Pr6_TwoDimensionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String x[][]=new String[2][5];
		System.out.println("Total no of rows are" +x.length); //It will display total no of rows
		System.out.println("Total no of columns are: "+x[0].length);
		
		//First Row
		x[0][0]="A";
		x[0][1]="B";
		x[0][2]="C";
		x[0][3]="D";
		x[0][4]="E";
		
		//Second Row
		x[1][0]="A1";
		x[1][1]="B1";
		x[1][2]="C1";
		x[1][3]="D1";
		x[1][4]="E1";
		
		//row=0, col=0 to 4
		//row=1, col=0 to 4
		//row=2, col=0 to 4
		
		for (int row=0;row<x.length;row++) {
			for(int col=0;col<x[0].length;col++) {
				System.out.println("The values present in Array x[][] are: "+x[row][col]);
			}
		}
		
		

	}

}
