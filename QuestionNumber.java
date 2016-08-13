package com.bridgelabz.programs;
/*
* created by: Bridge Labz
* Date 18/07/2016
* Perpose: Takes a numbers (N), asks you to think of a number between 0 and N-1, where N = 2^n, and always guesses the answer with n questions.
**/
import static java.lang.Math.pow;
>>>>>>> 5613916e28788e46980ccdb1dc9e37920cc1068b
import com.bridgelabz.util.Utility;
public class QuestionNumber
{
	static int range,c,lower,upper,middle;//these variables are used to hold the values of the number range given by user
    static String input;// this variable is used for user to give results for guesses number
	//This method is used to search the no. thought by user using binary search
	public  static void binarySearch(int lower,int upper,int middle,int c,String input,int num)
   {
	Utility u2=new Utility();
    System.out.println("Is your number:"+middle);
	input=u2.inputString();
       do
        {
            if (input.equals("low"))
            {
                lower= middle;
                c++;
            }
			else if (input.equals("yes"))
            {
                System.out.println("the number you thought was "+middle);
                int ts=c+1;
                System.out.println("It takes "+ts+" times to find your  exact number.");
                break;
            }
			else if(input.equals("high"))
            {
                upper=middle;
                c++;
            }
            if(c<num)
            {
				middle=(lower+ upper+1)/2;
				System.out.println("Is your number "+middle+":");
				input=u2.inputString();
	        }
	    }
      while(lower<=upper);
	   if (c>num)
			{
			  System.out.println("Number is not found");
			}
   }
	public static void main(String[] args)
    {
			try
				{
					Utility u1=new Utility();
					System.out.println("Enter any number");
					//ask the user enter number
		            int num=u1.getIntegerInput();
		            range=(int)pow(2,num)-1;//range calculation for the number
		            System.out.println("assume your number between 0 to "+range);
		            c=0;
					input=null;
		            lower=0;
		            upper=range;
		            middle=(lower+upper/2);
		   		    // QuestionNumber qn=new QuestionNumber();
						QuestionNumber.binarySearch(lower,upper,middle,c,input,num);//this is calling method to pass arguments
				}
					catch (ArrayIndexOutOfBoundsException ae)//exception handling
					{
						System.out.println("try to enter value at runtime only");
					}
    }
 }
