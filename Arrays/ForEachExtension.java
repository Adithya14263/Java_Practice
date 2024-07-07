package Arrays;

public class ForEachExtension {

	
		// TODO Auto-generated method stub
		public static void foreach() {
			
			
			int[] object = {11,22,33,44,};
			
			int sum=0;
			for(int Array : object) {
				sum=sum+Array;
			}
			System.out.println(sum);
		}
		
		
	public static void  foreacLoop() {
		int[][]object = { {10,10,15,},{20,10,22,}, {40,20,10,} };
		int sum=0;
	int	 index=0;
		for(int[] SingleDimensions:object) {
			for(int value : SingleDimensions ) {
				System.out.println(value);
				sum=sum+value;
				index++;
			}
			
		}
		System.out.println(sum/index);
	}
		
		
	public static void main (String[]args){
		
		 foreacLoop();
		
	}
	}


		
		
	