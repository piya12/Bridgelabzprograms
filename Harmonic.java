package com.bridgelabz.programs;
/*
* created by: BridgeLabz
* Date 10/05/2016
* Perpose: Prints the Nth harmonic number: 1/1 + 1/2 + ... + 1/N
**/
import com.bridgelabz.util.Utility;
public class Harmonic 
{
	public static void main(String args[])
	{
		int no;
		float harmonic;
        Utility u=new Utility();
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter no to calculate harmonic value:");
		no=sc.nextInt();
        //checking if no is greater than 0 to calculate harmonic
		if(no>0)
		{
		    //call to method calHarm which returns harmonic value
			harmonic=u.calHarm(no);
			System.out.println("Harmonic No:"+harmonic);
		}
		//if user entered no is less than 0
		else	
			System.out.println("Enter no greater than 0");
	}
}

