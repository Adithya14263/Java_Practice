package JavaPackage;

import java.util.Scanner;

public class Constructor  {
	int price ;
	public static void main (String[]args){
		Constructor obj = new Constructor  ();           // SampleClass obj = new SampleClass (22);
		System.out.println(obj.price);
	}

	public Constructor () {               // Constructor 1
		price=200;
	}
	public Constructor (int amount) {            // Constractor 2
		price=amount;
	}
}

