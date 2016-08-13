package com.bridgelabz.programs;
import com.bridgelabz.util.Utility;
/*
* created by: BridgeLabz
* Date 15/07/2016
*Perpose: Given N distinct Coupon Numbers, how many random numbers do you need to generate that distinct coupon number?
**/
import com.bridgelabz.util.Utility;
public class CouponNumbers
{
	public void genrateDistictCupons(int numberOfCupons)
	{
		int []randomNumbers=new int[numberOfCupons];
		for(int i=0;i<randomNumbers.length;i++)
		{
			randomNumbers[i]=(int)(Math.random()*100);//this method generate random numbers
		}
		//display the output
		for(int j=0;j<randomNumbers.length;j++)
		{
			System.out.println(randomNumbers[j]);
		}
	}
	public static void main(String[] args)
	{
		// reading the input from keyboard
		Utility u1=new Utility();
		//ask the use how many distinct number you want
		System.out.print("Enter how many numbers you wants :");
		int num=u1.getIntegerInput();
		CouponNumbers cn=new CouponNumbers();
		cn.genrateDistictCupons(num);
	}
}
