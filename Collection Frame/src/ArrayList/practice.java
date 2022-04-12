package ArrayList;

public class practice {

	public static void main(String[] args) {


		
		// Fact of 4 is 1*2*3*4 = 24
		// Fact of 6 is 1*2*3*4*5*6 = 720
		int fact=1,num=4;
		// most commonly we declare i=0 but here we are doing multiplication so 
		for(int i=1;i<=num;i++) {
		fact=fact*i;
		}
		System.out.printf("Factorial of %d is %d", num,fact);

		/*  Fibonacci number
		 * int num =5; int t1 = 0; int t2 = 1;
		 * 
		 * for(int i=0;i<=num;i++) { System.out.println(t1); int sum= t1+t2; t1=t2;
		 * t2=sum; //System.out.println(sum); }
		 */
		
		//printNum(5);// pritn numbr from 5 to 10
		//printNumber(10,50);// to print number from 10 to 50
		
		
//		Integer num1=100;
//		Integer num2 =100;
//		
//		if(num1==num2) {
//			System.out.println("botha re equal");
//		}
//		else
//		{
//			System.out.println("Both are not equal");
//		}
		
	}
	
	public static void printNum(int num)
	{
		if(num<=10)
		{
			System.out.println(num);
		     num++;
		     printNum(num);
		}
	}
	
	public static void printNumber(int startNum,int endNum)
	{
		
		if(startNum<=endNum)
		{
			System.out.println(startNum);
			startNum++;
			printNumber(startNum,endNum);
		}
	}

}
