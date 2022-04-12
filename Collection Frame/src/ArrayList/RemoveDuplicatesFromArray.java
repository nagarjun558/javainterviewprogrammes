package ArrayList;

public class RemoveDuplicatesFromArray {
	
	public static int removeDuplicates(int a[], int n)
	{
		if(n==0 || n==1)
		{
			return n;
		}
		
		//creating another array for sorting the unique eleemnts
		int temp[]=new int[n];
		int j=0;
		
		for(int i=0;i<n-1;i++)
		{
			if(a[i]!=a[i+1])
			{
				temp[j++] = a[i];
			}
		}
		
		temp[j++] =a[n-1];
		
		//changing the original array
		
		for(int i=0;i<j;i++)
		{
			a[i]=temp[i];
		}
		return j;
	}
	
	public static void main(String[] args) {
		int a[]= {1,1,2,2,2};
		int n=a.length;
		
		n= removeDuplicates(a,n);
		
		//priniting the array
		
		for(int i=0;i<n;i++)
		{
			System.out.println(a[i]+ " ");
		}
	} 

}
