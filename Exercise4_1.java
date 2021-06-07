
public class Exercise4_1 {

	public static void main(String[] args) {
		int score = 40;
		boolean isHandSome = false;
		
		if (score >= 80 || isHandSome) {
			System.out.println("Good!!");
		} else if (score >= 50 && score < 80) {
			System.out.println("Normal");
		} else if (score < 50) {
			System.out.println("Fail");
		}
	}

}
