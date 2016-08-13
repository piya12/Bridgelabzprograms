package com.bridgelabz.programs;
/*
* created by: BridgeLabz
* Date 09/05/2016
* Perpose:check whether it is a Leap Year or not.	 
**/
import com.bridgelabz.util.Utility;
/*public class LeapYear1
{
	void getIntegerInput(int year)
	{
		if(year<1000)
		{
			System.out.println("plz enter 4 digit number");
		}
		/*
		* Condition for Leap Year
		* A year is a leap year if it is divisible by 4 but not by 100.
		*If a year is divisible by both 4 and by 100, then it can only be a leap year if it is also divisible by 400.
		**/
		/*else
		{
			if((year%400==0)||(year%4==0)&&(year%100!=0))
			{
				System.out.println(year+ " is Leap Year");
			}
			else
			{
				System.out.println(year+ " is not Leap Year");
			}
		}*/
	}
	public static void main(String[] args)
	{
		// reading input from keyboard
		Utility u1=new Utility();
		//asking the user to enter 4 digit number
		System.out.print("Enter any year :");
		int year=u1.inputInteger();
		LeapYear t1=new LeapYear();
			t1.getIntegerInput(year);
	}
}


	

