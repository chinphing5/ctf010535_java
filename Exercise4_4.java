/*
 * File: Exercise4_4.java
 * ----------------------
 * 
 * For Loop, For each and While Loop
 * 
 */
public class Exercise4_4 {

	public static void main(String[] args) {
		// Lab 6 article 1
		int i = 1;
		
		while(i <= 10) {
			System.out.println("i = " + i);
			i++;
		}
		
		
		// Lab 6 article 2
		int sum = 0;
		for(int j = 1; j <= 10; j++) {
			sum += j;
		}
		System.out.println("sum of number 1 - 10 is " +  sum);
		
		
		// Lab 6 article 3
		for(int num = 1; num <= 100; num++) {
			if(num % 12 == 0) {
				System.out.println("Number " + num + " is divisible by 12.");
			}
		}
		
		
		// Lab 6 article 4
		int ar1[] = {1, 2, 3, 4, 5};
		for(int a : ar1){
			System.out.print(a + " ");
		}
		System.out.println("");
		
		// Lab 7 article 1
		int k = 20;
		do {
			System.out.print(k + " ");
			k--;
		} while(k > 0);
		System.out.println();
		
		// Lab 7 article 2
		int ar2[] = {2, 4, 6, 8, 10, 11, 12, 14};
		for(int a : ar2) {
			if(a % 2 != 0) {
				System.out.println("Input number " + a + " is odd. Program is terminated.");
				break;
			}
			System.out.println("Input number " + a + " is even.");
		}
		
		// Lab 8 article 1
		int count = 20;
		while(count > 0) {
			System.out.println("count = " + count);
			if(count == 11) {
				break;
			}
			count--;
		}
	}
}
