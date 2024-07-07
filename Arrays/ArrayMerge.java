package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayMerge {

	//first cloths  size chusukoo [ArraySize] ---->next gotham thisukoo [object]---->cloths[ArrayVAlues]   thravatha gotham lo kii vesukoo [object[i]]  ------>total gotham weight[.length]
	
	                                                //Merge two Arrays and print the output in the Console
	public static void main(String[] args) {
		
		                    // Array 1
		Scanner sc = new Scanner (System.in);
		System.out.println("Please enter the ArraySize1"); //size
		int ArraySize1 = sc. nextInt();
		
		String [] object1 = new String[ArraySize1];
		
		System.out.println("Plese enter the ArrayValues");
		for(int i=0; i<ArraySize1; i++) {
			object1[i]=sc.next();
		}
		System.out.println(" Input1:"+Arrays.toString(object1));
	
		
	                                          	// Array 2
		System.out.println("Please enter the ArraySize2");
		int ArraySize2 = sc.nextInt();
		
		String[] object2=new String[ArraySize2];
		
		System.out.println("Please enter the ArrayVAlues");
		for(int i =0; i<ArraySize2; i++) {
		 object2[i] = sc.next();
		}
		System.out.println("Input:"+Arrays.toString(object2));
		
		                                              
	                                             	//Merage
		String[] object3 = new String[object1.length+object2.length];
		for(int i=0; i< object1.length;i++) {
			object3[i]=object1[i];
		}
		
		for(int i=0; i<object2.length;i++) {
		object3[i+object1.length]=object2[i];
	}

		System.out.println("Output:"+Arrays.toString(object3));
	}
}
