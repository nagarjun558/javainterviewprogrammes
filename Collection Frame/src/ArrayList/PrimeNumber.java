
package ArrayList;

public class PrimeNumber {

	public static void main(String[] args) {
		System.out.println(isPrimeNumber(5));
		getPrimenumbers(9);
		

	}
	
	public static boolean isPrimeNumber(int num)
	{
		if(num<=1)
		{
			return false;
		}
		
		for(int i=2;i<=num/2; i++)
		{
			if(num%i ==0)
			{
				return false;
			}
		}
	
		return true;
		
	}
	
	public static void getPrimenumbers(int num)
	{
		for(int i=2;i<=num;i++)
		{
			if(isPrimeNumber(i))
				System.out.print(i+ " ");
				
				
		}
		
	}

}
