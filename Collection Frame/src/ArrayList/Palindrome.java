package ArrayList;

public class Palindrome {

	public static void main(String[] args) {
		/*
		 *  121 =121
		 *  323 =323
		 */

		
		int num=125;
		int temp,rev,sum=0;
		temp=num;
		
		while(num>0)
		{
			rev= num%10;//123%10=3  -->12%10=2 -->1
			num=num/10; //123/10=12--> 12/10 =1 -->1/10=1
			sum = sum*10+rev; //0*10+3= 3--> 3*10+2=32-->32*10+1=321
		}
		
		if(temp==sum)
		{
			System.out.println("GIven number is palindrome");
		}
			
		else
			System.out.println("Not an palindrome");
		
	}

}
