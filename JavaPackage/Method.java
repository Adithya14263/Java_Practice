package JavaPackage;

import java.util.Scanner;

public class Method {
	static int currentBalance = 1000;  
	
	public static  void Greatings() {
		System.out.println("Wellcome to office") ;
	}
		public void deposit(int amount) {

			currentBalance = currentBalance+amount;
			System.out.println("your deposit sucussfully completed 500");
		}
		
		public  static void withdraw(int amount) {
			currentBalance = currentBalance-amount;
			System.out.println("your withdraw sucussfull completed 300");
		}
			public int getcurrentBalance() {
				return currentBalance;
			}
		
		
	public static void main(String[] args) {
	Method customer = new Method ();
		Greatings();
	System.out.println("your currentbalces is :"+ customer.getcurrentBalance());

	customer.deposit(500);
	System.out.println("your currentbalces is :"+ customer.getcurrentBalance());
		withdraw(300);
		System.out.println("your currentbalces is :"+ customer.getcurrentBalance());
	}

}
