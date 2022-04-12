package Practise;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class CountCharacatersInString {

	public static void main(String[] args) {
		cuntChars("Nagarjun");

	}
	
	public static void cuntChars(String input)
	{
		input =input.toLowerCase();
		
		HashMap<Character, Integer> charCount = new HashMap<>();
		
		char[] strArray = input.toCharArray();
		
		for(char c:strArray)
		{
			if(charCount.containsKey(c))
			{
				charCount.put(c, charCount.get(c)+1);
			}
			else
			{
				charCount.put(c,1);
			}
		}
		System.out.println("InputString :"+ input + charCount);
		
		System.out.println("*************************************************");
		
		Set<Entry<Character,Integer>> charsInString = charCount.entrySet();
		
		for(Map.Entry ch : charsInString)
		{
			System.out.println( ch.getKey() +" : "  + ch.getValue() );
		}
	}

}
