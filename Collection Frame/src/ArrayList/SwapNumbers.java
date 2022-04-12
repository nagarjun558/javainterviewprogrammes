package ArrayList;

public class SwapNumbers {

	public static void main(String[] args) {

		int a = 10;
		int b = 20;
		
//		System.out.println("before swapping:");
//		System.out.println("a="+a);
//		System.out.println("b="+b);
//		
//		System.out.println("after swapping:");
//
//		int temp;
//		temp = a;
//		a = b;
//		b = temp;
//		
//		System.out.println("a="+a);
//		System.out.println("b="+b);
		
		//without temp var:
		System.out.println("before swapping:");
		System.out.println("a="+a);
		System.out.println("b="+b);

		System.out.println("after swapping:");

		a = a-b;//-10
		b = a+b;//10
		a = b-a;//20
		
		System.out.println("a="+a);
		System.out.println("b="+b);
		
		
		System.out.println("*********************************");
		String str1="hello";
		String str2="java";
		
		System.out.println("Before Swaping: "+ "str1 ="+ str1 +"Str2 ="+ str2);
		
		str1 = str1 + str2;    
		str2= str1.substring(0,str1.length()- str2.length());
		str1=str1.substring(str2.length());
		//str1 = str1.substring(str2.length());   
		
		System.out.println("After Swaping: "+ "str1 ="+ str1 +"Str2 ="+ str2);

		
	}

}
