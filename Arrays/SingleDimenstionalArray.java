package Arrays;

import java.util.Scanner;

public class SingleDimenstionalArray {
	
	//Array
	public static void array() {
		int [] value = new int[9 ];
		value [0]=9;
		value[1]=8;
		value[2]=7;
		value [3]=6;
		value[4]=5;
		value [5]=4;
		value[6]=3;	
		//System.out.println(value[5]);
		
		for (int i =0;i< value.length;i++) {    //lenth is print size of over all array
			System.out.println(value[i]);
		}
			}
	
	
	// ArraySum
	public static void arraySum() {
		int [] value = new int [5];
		value [0]=99;
		value [1]=88;
		value [2]=77;
		value [3]=66;
		value [4]=55;
		//value [5]=44;
	int	sum = value [0]+value [1]+value [2]+value [3];
	System.out.println(sum);
	}
	
	
	// ArrayWhileloop
	public static void arrayWhile() {
		int [] value = new int[3];
		value[0]=1;
		value[1]=2;
		value[2]=3;
		
		int i=0;
		while(i<value.length) {
			System.out.println(value[i]);
			i++;
		}
	}
	
	// ArrayForloop
	public static void arrayForloop() {
		int[] value = new int[] {1,2,3,4,5};
		
		for(int i=0; i<value.length; i++) {
			System.out.println(value[i]);
		}
	}
	
                           	//ArrayMethod
	public static void ArrayMethod() {
		int[] value = new int[] {1,2,3,4,5};

		System.out.println(value.length);
		System.out.println();
		for(int i=0;i<value.length;i++) {
			System.out.println(value[i]);
		}
			}
	
	
	public static void main (String[]args){
		array();
	arraySum();
		 arrayWhile();
		 arrayForloop();
		 ArrayMethod();
	}
	
	} 
	


