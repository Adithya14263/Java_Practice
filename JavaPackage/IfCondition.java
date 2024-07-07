package JavaPackage;

import java.util.Scanner;

public class IfCondition {

	// Method 1 
	public static void cloths() {
		double Tshirtprice = 55;
		double ShortPrice = 50;
		double pantprice =50;

		if( Tshirtprice > ShortPrice){
			System.err.println("your tshirt price is 55 rps");
		}
		else {
			System.err.println("your tshirt price is not 55 rps ");
		}
	}



	// Method 2
	public static void Exam () {
		String student = "Enters Exams";

		if(student == "Enters Exams") {
			System.err.println(" Student pass enters Exam");
		}
		else {
			System.err.println("Sorry is Student Fail ");
		}


		String Studentround1 = "Technical round ";
		if(Studentround1 !="Technical round ") {
			System.err.println("Congrats your succussfully completed Technical round Interview");
		}
		else {
			System.err.println("Sorry your Fail Technical round Interview");
		}
	}



	                                                                              // Method 2
	public static void oddEven(){
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter  the number");
		int number = sc.nextInt();

		if(number%2 ==0) {
			System.err.println("This is a Even Number");
		}
		else {
			System.err.println("This is a Odd Number");
		}
	}


	//                                                   Method 4
	public static void  studentMarks() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter your marks");
		int Marks = sc.nextInt();
		if(Marks ==35) {
			System.err.println("Your  pass congrates");

		}
		else if(Marks>35 && Marks<60) {
			System.err.println("your pass in Second Class Congrates");
		}
		else if(Marks>=60  && Marks<75 ) {
			System.err.println("Your pass in First Class Congrates");

		}

		else if(Marks >= 75 && Marks <=100 ) {
			System.err.println("Your get merit class");	
		}
		else if(Marks>35) {
			System.err.println("Sorry your Fail");
		}
		else  {
			System.err.println(" this is Invalide marks. please enter below the 100 marks");
		}
	}


	//                                                            Method 5
	public static void Day() {
		Scanner sc= new Scanner  (System.in);
		System.out.println("Please enter the month of the Day");
		int Day = sc.nextInt();

		if(Day==3 || Day==10 || Day ==17 || Day==24 ) {
			System.err.println("Today is a SUNDAY");
		}
		else if (Day==4|| Day==11 || Day ==18 ||Day==25) {
			System.err.println("Today is a MONDAY");
		}
		else if (Day==5 || Day==12 || Day ==19 || Day==26) {
			System.err.println("Today is a TUESDAY");
		}
		else if (Day==6 || Day==13 || Day ==20 || Day==27) {
			System.err.println("Today is a WENDESDAY");
		}
		else if (Day==8  || Day==14 || Day ==21 || Day==28) {
			System.err.println("Today is a THUESDAY");
		}
		else if (Day==1 || Day==9 || Day==15 || Day ==22 || Day==29) {
			System.err.println("Today is a FIRYDAY");
		}
		else if (Day==2 || Day==10 || Day==16|| Day ==23 || Day==30) {
			System.err.println("Today is a SATURDAY");
		}
		else if(Day>31){

			System.err.println("This is a Invalide day");

			System.err.println("Please enter the validate day");
		}
	}
	
	
	//                                                      Method 5
		public static void week() {
			Scanner sc = new Scanner(System.in);
			System.out.println("Please enter the week ");
			String Week = sc.nextLine();
			
			if (   Week.equals("monday")   ||   Week.equals("tuesday")   ||   Week.equals("wedsday")  ||   Week.equals("thursday")  
					|| Week.equals("friday")  ) {
					
			System.err.println("This is Working Day");
					}
		
					else   {
						System.err.println("This is a Weekend");
					}
					
					}
					


	public static void main(String[] args) throws InterruptedException {
		cloths();				
		Thread.sleep(5000);
		Exam () ;
		oddEven();
		studentMarks();
		Day() ;
		week();
	}

}

