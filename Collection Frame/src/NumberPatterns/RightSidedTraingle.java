package NumberPatterns;

public class RightSidedTraingle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;

		
		// Pattern for Right traingle number
		for (int i = 1, p = 1; i <= n; i++, p++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(p + " ");
			}
			System.out.println();
		}
 
		
	}

}
