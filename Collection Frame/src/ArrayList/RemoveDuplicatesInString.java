package ArrayList;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicatesInString {

	public static void main(String[] args) {
		removeDuplicatesUsingSet("abcabd");
		removeDuplicatesusingIndexOF("abcabd");

	}
	
	//Approach 1 using using Set
	public static void removeDuplicatesUsingSet(String str)
	{
		Set<Character> set = new LinkedHashSet<Character>();
		StringBuffer sb = new StringBuffer();

		
		for(int i=0;i<str.length();i++)
		{
			set.add(str.charAt(i));
		}
		
		for(Character c:set)
		{
			sb.append(c);
		}
		
		System.out.println(sb);
		
	}
	
	//Approcah 2 using indexOf()
	public static void removeDuplicatesusingIndexOF(String str)
	{
		StringBuffer sb = new StringBuffer();
		for(int i=0;i<str.length();i++)
		{
			char ch = str.charAt(i);
					int index= str.indexOf(ch,i+1);
					if(index==-1)
					{
						sb.append(ch);
					}
		}
		System.out.println(sb);
	}

}
