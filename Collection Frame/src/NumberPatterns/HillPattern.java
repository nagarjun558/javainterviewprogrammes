package NumberPatterns;

public class HillPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//upside hill pattern
		int n=5;
		for(int i=1,p=1;i<=n;i++,p++)
		{
			for(int j=i;j<=n;j++)
			{
				System.out.print("  ");
			}
			for(int j=1;j<i;j++)
			{
				System.out.print(p+"  ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print(p+ "  ");
			}
			System.out.println();
		}
		
		System.out.println("**********************************************");

		//Reverse hill pattern
		
		for(int i=1,p=1;i<=n;i++,p++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("  ");
			}
			for(int j=i;j<n;j++)
			{
				System.out.print(p+"  ");
			}
			for(int j=i;j<=n;j++)
			{
				System.out.print(p+"  ");
			}
			System.out.println();
		}
		
		
		
		
	}

}
