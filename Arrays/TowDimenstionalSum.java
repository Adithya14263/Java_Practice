package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class TowDimenstionalSum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
System.out.println("Please enter the RowSize:");
int RowSize = sc.nextInt();
int[][]object = new int[RowSize][];
for(int i=0; i<RowSize;i++) {
	System.out.println("Plese enter the Each  ColumSize in a Row: "+i);
	int ColumSize = sc.nextInt();
	object[i]=new int[ColumSize];
	
	System.out.println("Please enter the Each ColumValues  in a Row:"+i);
	for(int j=0;j<ColumSize;j++ ) {
		object[i][j]=sc.nextInt();
	}
}
for(int i=0;i<object.length;i++) {
	System.out.println(Arrays.toString(object[i]));
}
int sum=0;
for(int i=0; i<object.length;i++) {
	for(int j=0;j<object [i].length;j++) {
		sum =sum+object[i][j];
	}
}
System.out.println(sum);
	}

}
