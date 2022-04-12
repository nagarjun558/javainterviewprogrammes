package ArrayList;

import java.util.HashMap;

public class CountEachCharacterInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		characterCount("JAVA J2EE");

	}
	
	public static void characterCount(String inputString)
	{
		inputString= inputString.replaceAll("\\s", "");
		//Creating a HashMap containing char as a key and occurrences as a value
		HashMap<Character,Integer> charCount = new HashMap<Character, Integer>();
		
		//Converting given string to char array
		char[] strArray = inputString.toCharArray();
		
		//checking each char of strArray
		for(char c:strArray)
		{
			//If char 'c' is present in charCountMap, incrementing it's count by 1
			if(charCount.containsKey(c))
			{
				charCount.put(c, charCount.get(c)+1);
			}
			else
			{
				//If char 'c' is not present in charCountMap,
	            //putting 'c' into charCountMap with 1 as it's value
				charCount.put(c, 1);
			}
		}
		
		//printing the inputString and charCOunt
		
		System.out.println(inputString  + " : " + charCount);
	}

}
