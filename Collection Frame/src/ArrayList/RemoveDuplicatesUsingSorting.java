package ArrayList;

import java.util.Arrays;

/*
 * Sorting:
 * Convert the string to character array. S
   Sort the array, this will bring all the identical characters together.
   Iterate through character array and remove the duplicate characters.
   This approach will change the order of characters.
 * 
 * 
 */



public class RemoveDuplicatesUsingSorting 
{
public static String removeDuplicates(String s)
	{
 char[] chars = s.toCharArray();
 Arrays.sort(chars); // O(nlogn)
 String sbString = new String();
 for (int i = 1; i < chars.length; i++)
 {
 if(chars[i]!=chars[i-1])
 sbString +=chars[i];
 }
 //handle the first character
 if(chars[0]!=chars[1])
 sbString = chars[0] + sbString;
 return sbString;
 }

	public static void main(String[] args) {
		String s = "tutorialhorizon";
		System.out.println(removeDuplicates(s));
	}
}
