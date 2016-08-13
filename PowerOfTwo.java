package com.bridgelabz.programs;
/*
* created by: BridgeLabz
* Date 016/07/2016
* Perpose: This program takes a command-line argument N and prints a table of the powers of 2 that are less than or equal to 2^N.
**/
import com.bridgelabz.util.Utility;
public class PowerOfTwo
{
	public void printPowerOfTwo(int Number)
	{
		try
		{
			int i=0;//initail count=0
			int powerOfTwo=1;//calculating up to ith power of two
			//repeat loop until i equals to Number
			while(i<=Number)
			{
				if(Number>30)//check condition number morethan 30 we get Overflow error
				{
					System.out.println("Overflow an int");
					break;
				}
				else
				{
					System.out.println(i+ " "+powerOfTwo);// printing out the power of two
					powerOfTwo=2*powerOfTwo;		//double to get the next one
					i=i+1;		//increment i values	& check condition of loop
				}
			}
	  }
			catch (ArrayIndexOutOfBoundsException ae)//exception handling
			{
				System.out.println("try to enter value at runtime only");
			}
	}
	public static void main(String[] args)
	{
		Utility u1=new Utility();
		System.out.print("Enter the number:");
		int num=u1.getIntegerInput();
		PowerOfTwo p1=new PowerOfTwo();
		p1.printPowerOfTwo(num);
	}
}
