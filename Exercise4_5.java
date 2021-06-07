/*
 * File: Exercise4_5.java
 * ----------------------
 * 
 * Continue statement
 * 
 */
public class Exercise4_5 {

	public static void main(String[] args) {
		
		// Lab 9 article 1
		for (int count = 20; count > 0; count--) {
			System.out.println("count = " + count);
			if(count == 11) {
				continue;
			}
			System.out.println("after continue");
		}
		
		
		// Lab 10 article 1
		for(int i = 1; i <= 10; i++) {
			if(i == 2) {
				continue;
			}
			System.out.println("i = " + i);
		}
		
	}
}
