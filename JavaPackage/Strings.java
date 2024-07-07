package JavaPackage;

import java.util.Arrays;

public class Strings {

	public static void main (String[]args){
		String S1="Hello";
		String S2="Hello";
		String S3 = new String ("Hello");	
		String S4="heLlo";
		
		String D1=" Hello Friends ";
		String D2="King";
		String D3="Adithya";
		
		
		String D5="How are you friends";
        String Number = "12345";
        int id =20 ;
        String name ="   ";
		
		// Double equal operator used for verfy the data address
  //      System.err.println(" Double equal operator used for verfy the data address");	
		System.out.println(S1==S2);                                                               // true
		System.out.println(S1==S3);                                                              // false
		System.out.println();

		//  equals method used for verfy the data 
//		System.err.println("equals method used for verfy the data ");	
		System.out.println(S1.equals(S2));                                                   // true
		System.out.println(S2.equals(S3));                                                  // true
		System.out.println(S1.equals(S3));                                                 // true
		System.out.println();

		// String Method1
//		System.err.println("Method1");	
		System.out.println(S1.startsWith("H"));                                            // true
		System.out.println(S1.endsWith("o"));                                             // true
		System.out.println(S4.contains("L"));                                               // true
		System.out.println(S1.equalsIgnoreCase(S1));                           // true
		System.out.println(S1==S2);                                                               // true

		// String Method2
		System.out.println();
	//	System.err.println("Method2");	
		System.out.println(D2.length());                                                                                               //4
		System.out.println(D1.trim());                                                                                                   //Hello Friends
		System.out.println(D1.trim().length());                                                                               //13
		System.out.println(D1.indexOf("e"));                                                                                  //3
		System.out.println(D1.lastIndexOf("e"));                                                                         //11
		System.out.println(D1.toUpperCase());                                                                           //  HELLO FRIENDS 
		System.out.println(S1.toLowerCase());                                                                           //hello
		System.out.println(D1.toCharArray());                                                                           // Hello Friends 
		System.out.println(D3.substring(4,7));                                                                           //hya
		System.out.println(Arrays.toString(D1.split(" ")));                                                  //[, Hello, Friends]
		System.out.println(D3.charAt(3));                                                                                  //t
		
		// String Method3
		System.out.println();
		System.err.println("Method3");	
		System.out.println(D5.replace("How", "Whow"));                                               //Whow are you friends
		System.out.println(Integer.valueOf(Number));                                                      //12345
		System.out.println(String.valueOf(id));                                                                     //20
		System.out.println(name.isEmpty());                                                                        //false
		System.out.println(name.isBlank());                                                                          //true
	} 

	
	}


