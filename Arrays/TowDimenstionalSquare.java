package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class TowDimenstionalSquare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Please enter the RowSize:");
		int RowSize=sc.nextInt();
		int[] []object = new int[RowSize][];
		for(int i=0;i<RowSize;i++) {
			System.out.println("Please enter the ColumSize:"+i);
			int ColumSize = sc.nextInt();
			object[i]=new int[ColumSize];

			System.out.println("Please enter the ColumValues:"+i);
			for(int j=0;j<ColumSize;j++) {
				object[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<object.length;i++) {
			System.out.println(Arrays.toString(object[i]));
		}
		
		int[][]Square = new int [object.length][];
		for(int i=0;i<object.length;i++) {
			Square[i]=new int[object.length];
			
			for(int j=0; j<object[i].length;j++) {
			//	Square[i][j]=(int)Math.pow(object[i][j], 2);      //   Square [i][j]=object[i][j];
				  Square [i][j]=object[i][j];
			}
		}
		System.out.println("Final OutPut:");
		for(int i=0; i<object.length;i++) {
			System.out.println(Arrays.toString(Square[i]));
		}
	}
}
