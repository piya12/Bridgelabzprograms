package com.bridgelabz.programs;
import com.bridgelabz.util.Utility;
import java.util.Scanner;
class Hello
{
	public static void main(String args[])
	{
		String temp="",uname;

		Utility u=new Utility();
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter your name of length more than 3");
		temp=sc.next();
		//checks the length of name 
		if(u.checkLength(temp))
		{
			//if check length returns true 
			//call method replaceUsername to replace username
			uname=u.replaceUsername(temp);
			System.out.println(uname);
		}
		//if name length is less than 3
		else
			System.out.println("Username should be more than 3 characters");
	}

} 
