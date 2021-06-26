
public class Exercise7 {

	public static void main(String[] args) {
		String s1 = "You and Me", s2 = " you and me ";

		System.out.println("s1 = \"You and Me\", s2 = \" you and me \"\n");
		System.out.println("1. Are s1 and s2 equal? : " + s1.equals(s2));
		System.out.println("2. Can the word 'and' be found in s1? : " + s1.contains("and"));
		System.out.println("3. Length of s1 is " + s1.length() + " . Length of s2 is " + s2.length());
		System.out.println("4. Substring of s1 at position 1 to 4 is \"" + s1.substring(1, 5) + "\"");
		System.out.println("5. s2 after triming \"" + s2.trim() + "\"");
		System.out.println("6. s1 toUppercase : \"" + s1.toUpperCase() + "\"");
		System.out.println("7. s2 toUppercase and trim : \"" + s2.trim().toUpperCase() + "\"");
	}
}
