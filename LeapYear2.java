package com.bridgelabz.programs;
/*
* created by: BridgeLabz
* Date 09/05/2016
* Perpose:check whether it is a Leap Year or not.	 
**/

public class LeapYear2
{
  public static void main(String[] args)
  {
		int year = 2013;
		int value = (year%4)==0 ? 1 : 0;
		if(value == 1)
			System.out.println("Leap year");
		else if(value == 0)
			System.out.println("Not leap year");
	}
}


    

