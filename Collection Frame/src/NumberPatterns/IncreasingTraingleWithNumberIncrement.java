package NumberPatterns;

public class IncreasingTraingleWithNumberIncrement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=5;
		for(int i=1;i<=n;i++)
		{
			int p=1;
			for(int j=1;j<=i;j++)
			{
				System.out.print(p+++" ");
			}
			
			System.out.println();
		}

	}

}
