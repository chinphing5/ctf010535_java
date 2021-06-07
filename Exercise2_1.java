/*
 * File: Exercise2_1.java
 * ----------------------
 * This program displays the primitive type of Java.
 * 
 */
public class Exercise2_1 {

	public static void main(String[] args) {
		//The byte data type is an 8-bit signed two's complement integer. It has a minimum value of -128 and a maximum value of 127 (inclusive).
		byte b = 127;
		short s = 32767;
		int i = 1_000_000;
		long l = 15000000000L;
		
		float f = 5.99f;    // Floating point number
		double d = 6.667e-11; //0.00000000006667 in scientific notation
		char c = 'A';         // Character
		boolean bl = true;       // Boolean
		String str = "Hello, World"; 
		
		System.out.println("This is a " + ((Object)b).getClass().getSimpleName()+ " " + b);
		System.out.println("This is a " + ((Object)s).getClass().getSimpleName()+ " " + s);
		System.out.println("This is a " + ((Object)i).getClass().getSimpleName()+ " " + i);
		System.out.println("This is a " + ((Object)l).getClass().getSimpleName()+ " " + l);
		
		System.out.println("This is a " + ((Object)f).getClass().getSimpleName()+ " " + f);
		System.out.println("This is a " + ((Object)d).getClass().getSimpleName()+ " " + d);
		System.out.println("This is a " + ((Object)c).getClass().getSimpleName()+ " " + c);
		System.out.println("This is a " + ((Object)bl).getClass().getSimpleName()+ " " + bl);
		System.out.println("This is a " + ((Object)str).getClass().getSimpleName()+ " " + str);
	}

}
