package NumberPatterns;

public class LeftSidedTraingle {
	public static void main(String[] args) {
		int n=5;
		
		for(int i=1,p=1;i<=n;i++,p++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("  ");
			}
			for(int j=i;j<=n;j++)
			{
				System.out.print(p+" ");
			}
			System.out.println();
			
		}
	}

}
