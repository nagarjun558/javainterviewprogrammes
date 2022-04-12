package Practise;

import java.util.Stack;

public class BODMAS_ex {
	public static int solve_this(String expression)
	{
		char[] ar_tok = expression.toCharArray();
		Stack<Integer> values = new Stack<Integer>();
		Stack<Character> sta_obj = new Stack<Character>();
		
		for (int i = 0; i < ar_tok.length; i++){
			
			if (ar_tok[i] == ' ') 
			continue; 
			
			if (ar_tok[i] >= '0' && ar_tok[i] <= '9') 
			 { 
			 StringBuffer buff_s = new StringBuffer(); 
			
			while (i < ar_tok.length && ar_tok[i] >= '0' && ar_tok[i] <= '9') 
			buff_s.append(ar_tok[i++]); 
			values.push(Integer.parseInt(buff_s.toString())); 
			} 
			// Our token is an opening bracket? push it onto 'sta_obj' 
			else if (ar_tok[i] == '(') 
			sta_obj.push(ar_tok[i]); 
			  
			// Once we meet the closing bracket , solve the complete bracket 
			else if (ar_tok[i] == ')') { 
			while (sta_obj.peek() != '(') 
			values.push(applyOp(sta_obj.pop(), values.pop(), values.pop())); 
			sta_obj.pop(); 
			} 
			// Incase the token is an operator 
			else if (ar_tok[i] == '+' || ar_tok[i] == '-' || 
			ar_tok[i] == '*' || ar_tok[i] == '/') 
			{ 
			// While top of 'sta_obj' has same or greater precedence to current 
			// token, which is an operator. Apply operator on top of 'sta_obj' 
			// to bring on top two elements in the values stack.
			while (!sta_obj.empty() && hasPrecedence(ar_tok[i], sta_obj.peek())) 
			values.push(applyOp(sta_obj.pop(), values.pop(), values.pop())); 
			sta_obj.push(ar_tok[i]); 
			}
			}
		    while (!sta_obj.empty()) 
			values.push(applyOp(sta_obj.pop(), values.pop(), values.pop()));
		    return values.pop();
		    }
	
	public static boolean hasPrecedence(char oper_1, char oper_2)
	{ 
		 if (oper_2 == '(' || oper_2 == ')') 
		  return false; 
		 if ((oper_1 == '*' || oper_1 == '/') && (oper_2 == '+' || oper_2 == '-')) 
		  return false; 
		  else
		  return true;
    }
	
	public static int applyOp(char oper, int var2, int var1)
	{
		switch (oper){

		case '+':
			return var1 + var2;
		case '-': 
			return var1 - var2; 
		case '*':
			return var1 * var2; 
			
		case '/':
			if (var2 == 0) 
				throw new ArithmeticException("division by zero.. immpossible!");
			return var1 / var2;

	}

		return 0;
	}
	
	public static void main(String[] args) 
	{ 
		
	System.out.println("Given Expression ::: (60/30)*25+100-60");
		
	System.out.println("******OUTPUTS******");
	
	System.out.println(BODMAS_ex.solve_this("60 / 30"));
	System.out.println(BODMAS_ex.solve_this("60 / 30) *25"));
	System.out.println(BODMAS_ex.solve_this("60 / 30) *25 + 100"));
	System.out.println(BODMAS_ex.solve_this("60 / 30) *25 + 100 -60"));




	}

}
