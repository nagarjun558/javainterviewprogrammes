 package ArrayProgrammes;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class FindDuplicatesInArray {

	public static void main(String[] args) {

		//1. Using traditional for loops
		
		String names[]= {"Arjun","Java","Javascript","Java","C","Arjun"};
		
		for(int i=0;i<names.length;i++)
		{
			for(int j=i+1;j<names.length;j++)
			{
				if(names[i].equals(names[j]))
				{
					System.out.println("Duplicate Element Fond:::"+names[i]);
				}
			}
		}
		
		System.out.println(" *******Duplicate elements in integer array***************");
		
		int arr[]= {1,2,1,3,4};
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					System.out.println("Duplicate Element Fond:::"+arr[i]);
				}
			}
		}
		
		System.out.println("********* using hasset*********");
		
		//2. Using HashSet
		
		Set<String> set = new HashSet<String>();
		
		for(String name:names)
		{
			if(set.add(name)==false)
			{
				System.out.println("Duplicate Element Fond:::"+name);
			}
		}
		
		System.out.println(" *******Duplicate elements in integer array***************");
		Set<Integer> setIntCount = new HashSet<Integer>();
		
		for(Integer arrcount:arr)
		{
			if(setIntCount.add(arrcount)==false)
			{
				System.out.println("Duplicate Element Fond:::"+arrcount);
			}
		}
		
		System.out.println("********* using HashMap*********");
		//Usng HashMap
		Map<String,Integer> storeMap = new HashMap<String,Integer>();
		
//		for(String name:names)
//		{
//			if(storeMap.get(name)==null)
//			{
//				storeMap.put(name, 1);
//			}
//			else
//			{
//				storeMap.put(name, storeMap.get(name)+1);
//			}
//		}
		
		for(String name :names)
		{
			if(storeMap.containsKey(name))
			{
				storeMap.put(name, storeMap.get(name)+1);
			}
			else
			{
				storeMap.put(name, 1);
			}
		}
		
		System.out.println(names+"::"+storeMap);
		
		System.out.println("********************************");
		
		Set<Entry<String,Integer>> entrySet = storeMap.entrySet();
		
		for(Entry<String,Integer> entry: entrySet)
		{
		if(entry.getValue()>1)
		{
			//System.out.println("Duplicate element found:::"+entry.getKey());
			
			System.out.println("Duplicate element found:::" +entry.getKey()+ "::"+entry.getValue());
		}
		}

	}
	


}
