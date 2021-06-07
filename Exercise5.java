/*
 * File: Exercise5.java
 * ----------------------
 * 
 * Return value method and Void method
 * 
 */
public class Exercise5 {
	public static void sayWelcome() {
		System.out.println("say : " + getWelcomeMessage());
	}
	
	public static String getWelcomeMessage() {
		return "Hello";
	}
	
	public static void main(String[] args) {
		System.out.println("Message = " + getWelcomeMessage());
		
		sayWelcome();
	}
}
