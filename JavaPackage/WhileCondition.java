package JavaPackage;

import java.util.Scanner;

public class WhileCondition {

	public static void main(String[] args) {
//		 Lopp() ;
//		 number();
//		 Even();
//		 ReversEven();
		 sum ();
		 }
public static void  Lopp() {
	int number = 1;
	while(number<3) {
System.err.println(" Adithya");
number++;
		}
}

                           //  Print the 1 to 100 numbers
	public static void number() {
		Scanner sc= new Scanner(System.in) ;
			System.out.println("Please enter the first Number");
		int firstNumb =sc.nextInt();
		
		System.out.println("Please enter the second Number");
		int secondNumb =sc.nextInt();
		
		while(firstNumb<secondNumb) {
			System.out.println(firstNumb);
			firstNumb++;
		}
	}
		
	                 //        Print the Even numbers 100 to 300 
	public static void Even()	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the starting number ");
		int startNumb = sc.nextInt();
	
		System.out.println("Please enter the ending number ");
		int endNumb = sc.nextInt();
		
		int	number = startNumb;
		while(number<endNumb) {
			if(number%2==0)
			System.out.println(number);	
			number++;
		}
	}
	
	   //        Print the Even numbers 100 to 300 
		public static void ReversEven() {
			Scanner sc = new Scanner(System.in) ;
				System.out.println("Please enter the starting Number");
				int startingNumb = sc.nextInt();
				
				System.out.println("Please enter the ending Number");
				int endingNumb = sc.nextInt();
				int number =endingNumb;
					
				while( startingNumb<number) {
					if(number%2==0)
				System.out.println(number);	
				number--;
			}
		}		
		
		   //        Print the Even numbers sum
		public static void sum () {
			Scanner sc =new Scanner(System.in);
			System.out.println("enter the first value  ");
			int first = sc.nextInt();
			
			System.out.println("enter the second value  ");
			int second = sc.nextInt();
			int number = first;
			int sum=0;
			
			while(number<second) {
				if(number %2==0);
				
				sum +=number;
				number++;
			}
			System.out.println(sum);
		}
		
	}
	


