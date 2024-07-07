package JavaPackage;

import java.util.Scanner;

public class PrintStatementWithObject {

	static String Name = "Adithya";     
	double Age =24;
	double hight = 5.7;
	String weight = "65kgs";
	public static void main(String[]args) {
		String Qualification = "Engineer";
		
		System.out.println(Name);                                                                                               // static variable
		System.out.println(new PrintStatementWithObject().Age);                      // non static variable
		System.out.println("Qualification");
	}
}
