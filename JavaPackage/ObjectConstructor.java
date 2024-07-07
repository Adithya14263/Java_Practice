package JavaPackage;

import java.util.Scanner;

public class  ObjectConstructor  {

	int TeluguMarks ;
	int EnglishMarks ;

	public  ObjectConstructor (int Scroe, int Marks ) {        //  Constructor2 
		TeluguMarks= Scroe;
		EnglishMarks =Marks;
	}

	// add both  StudentId and StudentMarks
	public int add() {
		return  TeluguMarks+EnglishMarks ;
	}
	
	public static void main(String[] args) {
		
		ObjectConstructor obj = new  ObjectConstructor(300,500);
		ObjectConstructor objs = new 	ObjectConstructor(300,700);

		System.out.println(obj.add());	
		System.out.println(objs.add());	
	
	}
}
