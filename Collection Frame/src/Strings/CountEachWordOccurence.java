  package Strings;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class CountEachWordOccurence {

	public static void main(String[] args) {

		//String str = "GeeksforGeeks A computer science portal for geeks ";
		//String word = "portal";
		//System.out.println(countOccurrences(str, word));

		System.out.println("************************");

		findDupicateWords("hello nagarjun you are good nagarjun why nagarjun coding is good hello");

		System.out.println();
	}

	static int countOccurrences(String str, String word) {
		// split the string by spaces in a
		String a[] = str.split(" ");

		// search for pattern in a
		int count = 0;
		for (int i = 0; i < a.length; i++) {
			// if match found increase count
			if (word.equals(a[i]))
				count++;
		}

		return count;
	}

	public static void findDupicateWords(String inputString) {
		
		// split the string
		String words[] = inputString.split(" ");

		// create one hashMap

		HashMap<String, Integer> wordCount = new HashMap<String, Integer>();

		// to chek each word in a given array
		for (String word : words) {
			// If word is present
			if (wordCount.containsKey(word)) {
				
				wordCount.put(word, wordCount.get(word) + 1);
			} 
			else {
				wordCount.put(word, 1);
			}

		}

		// extracting all the keys of map - wordCOunt

		
		  Set<Entry<String,Integer>> wordsInString = wordCount.entrySet();
		  
		  // loop through all the words in a wordscount
		  
		  for (Entry<String, Integer> word : wordsInString) {
			  
			  if(word.getValue()>1)
			  {
				  System.out.println(word.getKey()+"::"+ word.getValue());
			  }
		  }
		  
//		  if (wordCount.get(word) > 1) {
//		  
//		  System.out.println(word + ": " + wordCount.get(word)); }
//		  
//		  }
		 
//		  System.out.println("************************");
//		
//		  // Printing the charCountMap 
//		
//		  for (Map.Entry entry : wordCount.entrySet()) 
//		  {
//		  System.out.println(entry.getKey() + " " + entry.getValue()); 
//		  }
//		 
	}

}
