package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySum {
	//first cloths  size chusukoo [ArraySize] ---->next gotham thisukoo [object]---->cloths[ArrayVAlues]   thravatha gotham lo kii vesukoo [object[i]]  ------>total gotham weight[.length]
	
                                          	//   Print the Sum of the Integers in an integer Array
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Please enter the ArraySize");
		int ArraySize = sc.nextInt();

		int[] object = new int[ ArraySize];

		System.out.println("Please enter the ArrayVAlues");
		for(int i=0; i< ArraySize; i++) {
			object[i]=sc.nextInt();			
		}
		System.out.println("Input:"+Arrays.toString(object));                                // Array printing 

		int sum = 0;
	for(int i=0; i< object.length; i++) {
	//	System.out.println(object[i]);
		sum =sum+object[i];  

	}
	System.out.println("output:"+sum);
		System.out.println("output:"+sum/object.length);                                                                         //  Average

	}

}
