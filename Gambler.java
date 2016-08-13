package com.bridgelabz.programs;
/*
* created by: BridgeLabz
* Date 14/07/2016
* Perpose:  Simulates a gambler who start with $stake and place fair $1 bets until he/she goes broke (i.e. has no money) or reach $goal.
* Keeps track of the number of times he/she wins and the number of bets he/she makes. Run the experiment N times, averages the results,
* and prints them out.
**/
import com.bridgelabz.util.Utility;
import java.math.*;
public class Gambler
{
	public static void main(String[] args)throws Exception
	{
	int w=0;
	int l=0;
	Utility u=new Utility();
	int stake, goal, number;
	System.out.println("enter the stake");
	stake = u.inputInteger();
    // to initalize variables. It input from user
	System.out.println("enter the goal");
	goal = u.inputInteger(); 
	System.out.println("enter the number");
	number = u.inputInteger(); 
	int bets= 0;
	int win = 0;
	for(int i= 0; i<=number;i++)
		{
			int cash = stake;
				if(cash>0 && cash<goal)
					bets++;
					{
						double	 m= Math.random();
							if(m>0.5)
								{
									w++;
                                }
							else
								{
									l++;
								}
					}
       }
	System.out.println("the percentage of win is "+(w*100)/number);  // percentage of win
	System.out.println("the percentage of loss is "+(l*100)/number); // percentage of loss
	System.out.println("the average of loss is "+(1.0*bets)/number);  // total avg of bets made
	System.out.println("number of win ="+w);
	System.out.println(number);
	}
}



























