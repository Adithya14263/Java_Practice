package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayLargestNum {
//first cloths  size chusukoo [ArraySize] ---->next gotham thisukoo [object]---->cloths[ArrayVAlues]   thravatha gotham lo kii vesukoo [object[i]]  ------>total gotham weight[.length]

	                                                          //Find the Max number from an Array along with index 
	public static void ArrayMaxNum() {
		Scanner sc = new Scanner (System.in);
		System.out.println("Please enter the ArraySize");
		int  ArraySize=sc.nextInt();

		int[] object =new int[ ArraySize];

		System.out.println("Please enter the ArrayValues");
		for(int i=0; i< ArraySize; i++) {
			object[i]=sc.nextInt();
		}
		System.out.println("input"+Arrays.toString(object));

		int		LargestNumber=object[0];
		int   LargestNumberIndex =0;

		for(int i=0; i<object.length;i++) {
			if(LargestNumber<object[i]) {
				LargestNumber=object[i];
				LargestNumberIndex=i;			
			}
		}
		System.out.println("Maxmium LargestNumber :"+" "+LargestNumber);
		System.out.println("Maximum LargestNumber Index"+" "+LargestNumberIndex);
	}

	
	                                            //Find the Min Word from an Array along with index 
	public static void ArrayMaxiWord() {
		Scanner  sc=new Scanner(System.in);
		System.out.println("Please enter the ArraySize");
		int ArraySize = sc.nextInt();

		String[] object = new String[ArraySize];

		System.out.println("Please enter the ArrayValues");
		for(int i=0; i<ArraySize;i++) {
			object[i]=sc.next();
		}
		System.out.println("Input:"+Arrays.toString(object));

		String MaximumWord = object[0];
		int   MaximumWordIndex = 0;

		for(int i=0; i<object.length;i++) {
			if(MaximumWord.length()>object[i].length()) {
				MaximumWord=object[i];
				MaximumWordIndex=i;
			}
		}
		System.out.println("MaximumWordLength:"+" "+MaximumWord);
		System.out.println("MaximumWordIndex:"+" "+MaximumWordIndex);
	}


	                              //Reverse the Array and print it Console 
    public static void Revers() {
	Scanner sc= new Scanner (System.in);
	System.out.println("Pleae enter the ArraySize ");
	int ArraySize = sc.nextInt();
	
	boolean[] object = new boolean[ArraySize];
	
	System.out.println("enter the ArrayValues");
	for(int i=0; i<ArraySize;i++) {
		object[i]=sc.nextBoolean();		
	}
	System.out.println(Arrays.toString(object));
	
	boolean[] RevArr = new boolean[object.length];
	for(int i=0; i<object.length;i++) {
		RevArr[object.length-i-1]=object[i];
	}
	System.out.println(Arrays.toString(RevArr));
}

	public static void main(String[] args) {
	//	ArrayMaxNum();
	//	ArrayMaxiWord();
		Revers();
	
	}

}
