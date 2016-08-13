package com.bridgelabz.programs;
/*
* created by:BridgeLabz
* Date 09/05/2016
* Perpose: this program replace "UserName" with proper user name.
**/
import com.bridgelabz.util.Utility;
public class StringReplace
{
	public void checkLengthOfUserName(String name )
	{
		//checking the name length
		if(name.length()<=2)
		{
			System.out.println("Plz..User name should contain at least 3 characters.....");
		}
		else
		{
			System.out.println("Hello "+name+" ,"+" How are you ?");
		}
	}
	public static void main(String[] args)
	{
		Utility u1=new Utility();
		// ask the user enter any name
		System.out.print("Enter User Name :");
		String	name=u1.inputString();
		StringReplace s1=new 	StringReplace();
		s1.checkLengthOfUserName(name);
	}
}
