
public class Exercise8 {

	public static void main(String[] args) {
		int[][] array2d = {{1, 2, 3}, {4, 5, 6, 7}, {8, 9, 10}};
		System.out.println("Display data in array2d.");
		for(int[] a : array2d) {
			for(int i : a) {
				System.out.print(i + " ");
			}
			System.out.print("\n");
		}
		
		System.out.println("Print sum of the last number in each row.");
		int sum = 0;
		for(int row = 0; row < array2d.length; row++) {
			int[] a = array2d[row];
			for(int col = 0; col < a.length; col++) {
				System.out.print(a[col]);
				if(col != a.length-1) {
					System.out.print(", ");
				} else {
					sum += a[col];
				}
			}
			System.out.print("\n");
		}
		System.out.println("Result is " + sum);
	}

}
