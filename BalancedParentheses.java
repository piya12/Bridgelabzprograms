package com.bridgelabz.programs;
import com.bridgelabz.util.Stack;
import com.bridgelabz.util.Utility;
/*
*Created by:Bridge Labz
*Perpose:read an Arithmetic Expression such as (5+6)∗(7+8)/(4+3)(5+6)
*Ensure parentheses must appear in a balanced or not.
**/
<<<<<<< HEAD
public class BalancedParentheses
=======
class BalancedParentheses
>>>>>>> 5613916e28788e46980ccdb1dc9e37920cc1068b
{
	public static void main(String arg[])throws Exception
	{
		Utility u = new Utility();
		Stack<Character> stack;
		int i;
		System.out.println("Enter expression:");
		//get expression from user
		String exp = u.getStringInput();
		//call Stack library
		stack = new Stack(exp.length());
		for(i=0; i<exp.length(); i++)
		{
			if(exp.charAt(i) == '(')
				stack.push('(');
			else if(exp.charAt(i) == ')')
				stack.pop();
		}
		if(stack.isEmpty())
			System.out.println("Expression is balanced");
		else
			System.out.println("Expression is not balanced");
	}
}
