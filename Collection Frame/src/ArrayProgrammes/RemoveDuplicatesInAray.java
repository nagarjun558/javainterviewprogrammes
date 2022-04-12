package ArrayProgrammes;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicatesInAray {

	public static void main(String[] args) {
		int arr[]= {5,2,5,6,7,86,9,2};
		
		removeDuplictes(arr);
		removeDuplicatesviaLoops(arr);

	}

	
	public static void removeDuplictes(int[] arr)
	{
		Set<Integer> set = new HashSet<>();
		
		for(int i=0;i<arr.length;i++)
		{
			set.add(i);
		}
		System.out.println(set);
		
	}
	
	public static void removeDuplicatesviaLoops(int arr[])
	
	{
		Arrays.sort(arr);
		int j=0;
		int len=arr.length;
		for(int i=0;i<len-1;i++)
		{
			if(arr[i]!=arr[i+1])
			{
				arr[j++]= arr[i];
				
			}
		}
		arr[j++]= arr[len-1];
		
		for(int k=0;k<j;k++)
		{
			System.out.print(arr[k]+" ");
		}
		
	}
}
