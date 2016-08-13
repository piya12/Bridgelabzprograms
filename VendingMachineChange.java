package com.bridgelabz.programs;
import com.bridgelabz.util.Utility;
/*
*Created by:BridgeLabz
*Perpose:calculate the minimum number of Notes as well as the Notes to be returned by the Vending Machine as a Change
* taking array for Notes
* using Recursion Calculating number of minimum Notes Return by Vending machine
**/
public class VendingMachineChange 
{
	// Static Variables i for indexing the array and total for calculating the total Notes
	static int i=0;
	static int total=0;
	// initialization of new arrayp;+
	static int[] notes={1000,500,100,50,5,2,1};
	//function for calculating the notes
	static int money;
public static int calculateFun(int money, int[] notes)
    {
    	// calling calculate function
    	int rem;
    	if(money==0)
    	{
    		return -1;
    	}
    	else
    	// logic for calculating the notes
    	{
    		if(money>=notes[i])
            {
                // logic for Calculating The notes
           		int calNotes =money/notes[i];
             	rem = money%notes[i];
           	    money =rem;
            	total += calNotes;
            	System.out.println(notes[i] +  "notes---------->"  +calNotes);
            }
    		i++;
    		return calculateFun(money,notes);
       }
    }
    // Starting main Function
 public static void main(String[] args) 
      {
		Utility u1=new Utility();
		// asked the user Enter the money
		System.out.println("Enter how much money do u want to counter");
		money=u1.getIntegerInput();
		System.out.println("notes :"+notes);
		// creating the object of vending machin class
		int retValue=VendingMachineChange.calculateFun(money,notes);
		System.out.println("total number of notes are:"  + total);
	  }
}

    



