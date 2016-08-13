package com.bridgelabz.programs;
/*
* created by: BridgeLabz
* Date 16/07/2016
* Perpose:Reads in N integers and counts the number of triples that sum to exactly 0.  ­
**/
import com.bridgelabz.util.Utility;
public class TripletSum
{
	public static int findDistinctTriples(int b[],int length)//method 1
	{
		System.out.println("========================");
		int i,j,k,count=0;
		for(i=0;i<length;i++)
		{
			for(j=i+1;j<length;j++)
			{
				for(k=j+1;k<length;k++)
				{
					// printing distinct triples (i, j, k) where a[i] + a[j] + a[k] = 0
					if (b[i] + b[j] + b[k] == 0)
						{
						 System.out.println(b[i] + " " + b[j] + " " + b[k]);
						 count++;
						}
				}
			}
		}
		// return number of distinct triples (i, j, k) such that a[i] + a[j] + a[k] = 0
		return count;
	}
	public static void main(String[] args)
	{
		Utility u1=new Utility();
		//enter the array size
		System.out.print("Enter Size of Array :");
		int size=u1.getIntegerInput();
		int arr[]=new int [size];//create array & read values one by one
		for(int i=0;i<arr.length;i++)
		{
			System.out.print("Enter "+(i+1)+" Value :");
			arr[i]=u1.getIntegerInput();
		}
		TripletSum t1=new TripletSum();
		int sum=t1.findDistinctTriples(arr,size);//pass the arguments to method 1
		System.out.println("========================");
		System.out.println("No.of Tripltes :"+sum);
		System.out.println("=======================");

	}
}
