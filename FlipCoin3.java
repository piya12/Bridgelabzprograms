package com.bridgelabz.programs;
import java.util.Random;
import com.bridgelabz.util.Utility;
/*
* created by: BridgeLabz
* Date 09/05/2016
Perpose:Flip Coin and prints percentage of Heads and Tails.
**/
public class FlipCoin3 
{
   static  int head;
   static  int tail;
   static int no;
   static int headper;
   static int tailper;
   public static void main(String[] args)

   {
     // create a new scanner with the specified String Object
     Utility u=new Utility();
     System.out.println("Enter the number of time you want to flip");
     int b=u.inputInteger();   // taking a input value from user
    
     Random coin=new Random();
     for(int i=0;i<b;i++)
         {
    	   if(coin.nextInt()<0.5)
    	     {
                 tail++;
     		     System.out.println("head");
    	      }
           else
    	     {
    		    head++;
    		    System.out.println("tail");
    	     }
		 }
	tailper= 100*tail/b; // calculating the percentage of tail
	headper=100*head/b;  // calculating the percentage of head
    System.out.println("Number of runs with tail= " + tailper);
    System.out.println("Number of runs with head =" + headper);
    }
}


    
     
    

