/*
 * File: Exercise2_2.java
 * ----------------------
 * 
 */
public class Exercise2_2 {
	
	private static void bark() {
		String dogName = "Latte";
		System.out.println("The Dog name = " + dogName + " bark");
	}
	public static void main(String[] args) {
		// 1
		bark();
		
		// 2
		int i = 1_000_000;
		float f = 5.99f;
		double d = 1e-46;
		char c = 'A';
		
		System.out.println("float f = " + f + " cast to int f = " + (int)f );
		System.out.println("int i = " + i + " cast to float i = " + (float)i );
		System.out.println("double = " + d + " cast to float d = " + (float)d );
		System.out.println("char = " + c + " cast to int c = " + (int)c );
		
		//3
		final String hello = "hello";
		//hello = ""; //Compiled failed. Cannot assign new value to final variable.

	}

}
