package ArrayList;

import java.util.stream.IntStream;

public class PrintNumberwithoutLoop {
	
	/* We can print numbers with out loop sing 2 ways
	 *  By Naveen
	 * 1. Recursive function
	 * 2. Java Streams
	 */

	public static void main(String[] args) {
		
		printNum(1); // to print form 1 to 10
		printNum(5); // to print form 5 to 10
		//printNumber(10,50);
		
		//2. sing Streams
		//IntStream.range(1,11).forEach(e->System.out.println(e));

	}
	
	//1. Recursive function
	public static void printNum(int num)
	{
		if(num<=10)
		{
			System.out.println(num);
			num++;
			printNum(num);
			
		}
	}
	
	// If you want to print from range ex:5 to100 not from 1
	
	public static void printNumber(int startNum, int endNum)
	{
		if(startNum<=endNum)
		{
			System.out.println(startNum);
			startNum++;
			printNumber(startNum,endNum);
		}
	}

}
