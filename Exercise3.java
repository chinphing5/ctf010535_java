
public class Exercise3 {

	public static void main(String[] args) {
		int i = 20;
		
		// 1 
		i++; i++; i++; i++; i++;
		System.out.println("i = " + i);
		
		--i; --i; --i; --i; --i;
		System.out.println("i = " + i);
		
		// 2
		float f = 2.1f;
		//f = f && 1; //Compiled failed. The operator && is undefined for the argument type(s) float, int
		
		// 3
		char c = 'A';
		//c = c || 5; //Compiled failed. The operator || is undefined for the argument type(s) char, int
		
	}

}
