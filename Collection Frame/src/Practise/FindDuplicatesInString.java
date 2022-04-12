package Practise;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class FindDuplicatesInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		findDuplicates("javaj2ee");

	}

	public static void findDuplicates(String input) {
		HashMap<Character, Integer> charCount = new HashMap<>();

		char[] strArray = input.toCharArray();

		for (char c : strArray) {
			if (charCount.containsKey(c)) {
				charCount.put(c, charCount.get(c) + 1);
			} else {
				charCount.put(c, 1);
			}
		}

		 Set<Character> charsInString = charCount.keySet();

		System.out.println("Duplicates Given String :" + input);

		for (Character ch : charsInString) 
		{
			if (charCount.get(ch) > 1)

			{
				System.out.println(ch + " : " + charCount.get(ch));
			}
		}

		
		/*
		 * // To use entry Set System.out.println("Duplicates Given String :" + input);
		 * 
		 * for (Map.Entry entry : ((HashMap<Character, Integer>) charCount).entrySet())
		 * { System.out.println(entry.getKey() + " " + entry.getValue()); }
		 */

	}

}
