package StarPatterns;

public class IncreasingTraingleStarPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=5;
		//outer loop determines rows
		for(int i=1;i<=n;i++)
		{
			//inner loop determines columns
			for(int j=1;j<=i;j++) //j<=i determines inner loop has to print based on row value given
			{
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
