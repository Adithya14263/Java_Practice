package JavaPackage;

import java.util.Scanner;

public class ForloopCondition {


	public static void main (String[]args){
		even() ;
	}
	
	 //  Print the 1 to 100 numbers
	public static void numbers() {
		
		Scanner sc =new Scanner (System.in);
		System.out.println("enter the first value");
		int first = sc.nextInt();
		
		System.out.println("enter the second value");
		int second = sc.nextInt();
		
		for(int  i= first ; i<second ;i++) {
			System.out.println(i);
		}
	}
	
//  Print the 1 to 800 even number
		public static void even() {
			Scanner sc= new Scanner(System.in) ;
				System.out.println("'enter the first value");
				int first = sc.nextInt();
				
				System.out.println("'enter the second value");
				int second = sc.nextInt();
				
				for(int i= first ; i<second;i++) {
					if(i%2==0) {
						System.out.println(i);
					}
				}
				
			}
	} 
	


