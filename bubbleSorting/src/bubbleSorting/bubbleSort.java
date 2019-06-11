package bubbleSorting;

public class bubbleSort {
	static void bubble_sort(int array[]) {
		int number = array.length;
		int sum=0;
		
		for (int i=0; i<number; i++) {
			for( int j=1; j<(number-i); j++) {
				if(array[j-1] > array[j]) {
					sum = array[j-1];
					array[j-1] = array[j];
					array[j] = sum;
				}
			}
		}
	}
	
	public static void main(String args[]) {
		int[] array = {89,3,19,1,85,6,2};
		
		System.out.print("Arrays = [");
		for (int i=0; i<array.length; i++) {
			System.out.print(array[i]+ ",");
		}
		System.out.print("]");
		System.out.println("");
		bubble_sort(array);
		System.out.print("Arrays = [");
		for ( int i=0; i<array.length; i++) {
			System.out.print(array[i] + ",");
		}
		System.out.print("]");
	}
}




