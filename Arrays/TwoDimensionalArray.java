package Arrays;

public class TwoDimensionalArray {

			public static void methods() {
				
		                                        //    Method 1
				int [ ][ ] object = new int[3][2];
				
				object[0]= new int [] {1,2};
				object[1]=new int[] {3,4};
				object[2]=new int[] {5,6};
						
				for (int i=0; i<object.length; i++) {
					for(int j=0;j<object[i].length; j++) {			
						System.out.print(object[i] [j] +  "   ");			
					}
					System.out.println( );
				}	
			}		
			
			                          //Method1
			public static void Directmethod() {
				int [][] object= {  {1,2}, {3,4}, {5,6}   };
				
				for(int i=0; i<object.length; i++) {
					for(int j=0; j<object[i].length;j++) {
						System.out.print(object[i][j]);
					}
					System.out.println();
				}
			}
					
			                                     //size
			public static void Size() {
				int[][] object = new int [3][3];
				
				object[0]= new int[]{1,2,3};
				object[1]= new int[] {4,5,6};
						object[2]=new int[] {7,8,9};
						
					int	size=0;
						for(int i=0;i<object.length;i++) {
							size=size+object[i].length;
							System.out.println(size);
						}
			}
			
			
		public static void main (String[]args){
//			methods();
//			Directmethod() ;
			Size();
			}		
		}




