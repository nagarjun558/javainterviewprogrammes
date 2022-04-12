 package Strings;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		/*
		 * 1. Iterative method
		 * 2. recursive method
		 * 
		 */
		//Using iterativeMethod
		String input= "MyJava";
		
		
		char[] strArray =input.toCharArray();
		
		for(int i= strArray.length-1;i>=0;i--)
		{
			System.out.print(strArray[i]);
		}
		System.out.println("*******************************");
		System.out.println(reverseString(" Hello arjun"));
		
	

	}
	
	//Using iterativeMethod
	public static String reverseString(String str)
	{
		char charArr[]= str.toCharArray();
		String rev ="";
		for(int i= charArr.length-1;i>=0;i--)
		{
			rev= rev+charArr[i];
			
		}
		return rev;
		
	}
	
	//Using recursive method
	public static String recursiveMethod(String str)
	{
		if((null== str) || (str.length()<=1))
		{
			return str;
		}
		return recursiveMethod(str.substring(1))+str.charAt(0);
	}
	
	

}
