package JavaPackage;

import java.util.Scanner;

public class Operator {
	public static void main (String[]args){
	//	Arithmetic();
	//	 Unaryoperator();
		// Relationaloperator();
		 Conditionaloperator();
	}
	
	public static void Arithmetic() {
		int a= 20;
		int b=30;
		int c=40;
		
		System.out.println(a+b);
		System.out.println(a-c);
		System.out.println(c/a);
		System.out.println(c%a);
	}
	
	public static void Unaryoperator() {
		int a= 20;
		int b=30;
		
		
		System.out.println(++a);
		System.out.println(++a);
		System.out.println(a++);
		System.out.println(++a);
	}
	
	public static void Relationaloperator() {
		int a= 20;
		int b=30;
		
		
		System.out.println(a==b);
		System.out.println(a<b);
		System.out.println(a>b);
		System.out.println(a!=b);
		System.out.println(a>=b);
	}
	
	public static void Conditionaloperator() {
		int a= 20;
		int b=30;
		
		
		System.out.println(a ==b &&  a!=b);
		System.out.println(a!=b  ||  a<b);
		System.out.println(a>b || a<b);
		System.out.println(a>b  && b>a);
	
	
	
}
}
