package com.bridgelabz.app;
/*
* created by: BridgeLabz
* Date 10/05/2016
* Perpose: Prints the Nth harmonic number: 1/1 + 1/2 + ... + 1/N
**/
import com.bridgelabz.util.Utility;
public class HarmonicNumber
{
  public void calculateHarmonic(int number)
  {
    double sum = 0.0;
    for (int i=1;i<=number;i++)
    {
        sum=sum+(1.0/i);
    }
    // display the result of the Nth Harmonic number Sum
    System.out.println("Harmonic number:"+sum);
  }
    public static void main(String[] args)
	{  
		//reading input from keyboard
		Utility u1=new Utility();
		//asking user enter any number
		System.out.print("Enter the number :");
    int num =u1.inputInteger();
    HarmonicNumber h1=new HarmonicNumber();
    h1.calculateHarmonic(num);

    }
}
