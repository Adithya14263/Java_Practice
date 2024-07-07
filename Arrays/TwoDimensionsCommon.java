package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class TwoDimensionsCommon {

	public static void main(String[] args) {
    	// Array1
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
          	//Array2

System.out.println("Please enter the RowSizee:");
int RowSizee=sc.nextInt();
int[] []object2 = new int[RowSizee][];
for(int i=0;i<RowSizee;i++) {
System.out.println("Please enter the ColumSizee:"+i);
int ColumSizee = sc.nextInt();
object2[i]=new int[ColumSizee];

System.out.println("Please enter the ColumValues:"+i);
for(int j=0;j<ColumSizee;j++) {
object2[i][j]=sc.nextInt();
}
}
for(int i=0;i<object.length;i++) {
System.out.println(Arrays.toString(object2[i]));
}
	
//   Araya 3

int[][] Common = new int[object.length][];
for(int i=0;i<object.length;i++) {
	Common[i]=new int[object.length];
	for(int j=0;j<object[i].length;j++) {
		
		if(object[i][j]==object2[i][j]) 
			Common [i][j]=1;
			else
				Common [i][j]=0;	
	}
}
System.out.println("commonValues:");
for(int i=0;i<object.length;i++) {
	System.out.println(Arrays.toString(Common[i]));
}
	}

}
