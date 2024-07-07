package JavaPackage;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class  SampleClass{

	public static void main (String[]args){
		String S1="Hello";
		String S2="Hello";
		String S3 = new String ("Hello");	
		String S4="heLlo";
		
		String D1=" Hello Friends";
		String D2="Friends";
		String Number = "1234";
		int id = 23;

		// Double equal operator used for verfy the data address
		System.out.println(S1==S2);
		System.out.println(S1==S4);

		//  equals method used for verfy the data 
		System.out.println();
		System.out.println(S1.equals(S4));
		System.out.println(S1.equals(S2));
		System.out.println(S3.equals(S1));
		System.out.println(S3==S2);

		// String Methods 
		System.out.println();
		System.out.println(S1.startsWith("H"));
		System.out.println(S3.endsWith("o"));
		System.out.println(D1.contains("r"));
		System.out.println(S4.equalsIgnoreCase(S4));
		
		
		
		
		// String Methods 
		System.out.println();
		System.out.println(D1.length());                         
		System.out.println(D1.trim());
		System.out.println(D1.trim().length());
		System.out.println(D1.indexOf("e"));
		System.out.println(D1.lastIndexOf("e"));
		System.out.println(S1.toUpperCase());
		System.out.println(S4.toLowerCase());
		System.out.println(D2.charAt(4));
		System.out.println(D2.toCharArray());
		System.out.println(Arrays.toString(D1.split(" ")));
		System.out.println(D1.substring(2,5));
		
		
		System.out.println();
		System.out.println(Integer.valueOf(Number));
		System.out.println(String.valueOf(id));
		System.out.println(D1.replace("Friends"," mawwa"));
		System.out.println();
		System.out.println();
		


	}
}








