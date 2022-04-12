package ArrayProgrammes;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Practise {

	public static void main(String[] args) {
		
		
		//code to find the missing number in an array
//		int arr[]= {1,2,3,5};
//		
//		int sum=0;
//		for(int i=0;i<arr.length;i++)
//		{
//			sum=sum+arr[i];
//		}
//		
//		System.out.println(sum);
//		
//		int sum1=0;
//		for(int j=0;j<=5;j++)
//		{
//			sum1=sum1+j;
//		}
//		System.out.println(sum1);
//		
//		System.out.println("Missing number in array::"+(sum1-sum));
//		
		
		//Code to find largest and smalleset in tbhe given array
		
//		int numbers[]= {10,20,9878,-10};
//		
//		int largest=numbers[0];
//		int smallest=numbers[0];
//		
//		for(int i=1;i<numbers.length;i++)
//		{
//			if(numbers[i]>largest)
//			{
//				largest=numbers[i];
//			}
//			else if(numbers[i]<smallest)
//			{
//				smallest=numbers[i];
//			}
//		}
//		
//		System.out.println("lARGEST ::"+largest);
//		System.out.println("Smallest ::"+smallest);
		
		//Code to find Duplicates number in a array
		
		
		String names[]= {"java","Python","c","java","c"};
		
		//Using tradiditional for loop
		for(int i=0;i<names.length;i++)
		{
			for(int j=i+1;j<names.length;j++)
			{
				if(names[i].equalsIgnoreCase(names[j]))
				{
					System.out.println("Duplicate eleemnt found::"+names[i]);
				}
			}
		}
		
		//Using set
		System.out.println("********* using hashset***************");
		
		Set<String> set= new HashSet<String>();
		
		for(String name:names)
		{
			if(set.add(name)==false)
			{
				System.out.println("Duplicate eleemnt found::"+name);
			}
		}
		

		//Using maP
		System.out.println("********* using HASMAP***************");

		HashMap<String,Integer> mapCount= new HashMap<String,Integer>();
		
		for(String name:names)
		{
			if(mapCount.containsKey(name))
			{
				mapCount.put(name, mapCount.get(name)+1);
			}
			else
			{
				mapCount.put(name, 1);
			}
		}
		
		
		Set<String> wordCount = mapCount.keySet();
		
		for(String word :wordCount)
		{
			if(mapCount.get(word) >1)
             {
	          System.out.println("Duplicate found");
	          System.out.println(word +"::"+mapCount.get(word));
}

		}
		
		
	}

}
