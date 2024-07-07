package JavaPackage;

import java.util.Scanner;

public class SwitchCondition {
	public static void main (String[]args){
		 EvenOdd();
		 operator() ;
		 Week();
		 
	}
	public static void EvenOdd() {
		Scanner sc = new Scanner(System.in);
		System.out.println(" Please enter the  number");
		int number =sc.nextInt();

		int value = number%2;
		switch(value) {
		case 0:
			System.err.println("even");
			break;
			
		case 1:
			System.err.println("odd");
			break;
		}	
}
	
	
	public static void Week() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println(" month of the Week");
		String Week = sc.nextLine();
		
		switch(Week) {
		case "monday" :
		case "tuesday" :
		case "wedesday" :
		case "thuesday" :
		case "friday"  :
		System.err.println("This i s working days");
		break;
		
		case "saturday":
		case "sunday":
			System.err.println("This is a weekend");
			break;
			
			default:
				System.err.println("Invalidate'");
		}
			}

	
	
		public static void operator() {
	Scanner sc= new Scanner(System.in);
	System.out.println("Please enter the first value");
	int firstNumber =sc.nextInt();
	
	System.out.println("Please enter the second value");
	int secondNumber = sc.nextInt();
	
	System.out.println("Please enter the operator value");
	String operator = sc.next();
	
int result =0 ;
	
	switch(operator) {
	case  "+"  :
		result =  firstNumber+ secondNumber ;
		break;
		
	case "-" :
		result = firstNumber - secondNumber ;
		break;
		
	case "*" :
		result = firstNumber * secondNumber ;
		break;
		
	case "%" :
	result = firstNumber % secondNumber ;
	break;
	
	default:
	System.err.println(" invalidate input");


}
	System.err.println(result);
	}
}	
		
