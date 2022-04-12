package ArrayList;

public class ArmstrongNumber {

	public static void main(String[] args) {
		
		/*
		 *  153 == 1 5 3-- 1*1*1 +5*5*5 + 3*3*3
		 *                    1 + 125 + 27 =153
		 *                    
		 *   370 = 3*3*3 + 7*7*7 + 0 = 27+343 +0 =370
		 */
		
		int num =155;
		int temp;
		int rev,sum=0;
		temp=num;
		
		while(num>0)
		{
			rev = num%10;
			num= num/10;
			sum= sum+ rev*rev*rev;	
			
		}
		
		if(temp==sum)
		{
			System.out.println(" It is an Armstrong number");
		}
		else
			System.out.println("Not an armstrong number");

	}

}
