package com.bridgelabz.programs.sort;
import java.util.Scanner;
/*
*Created by :Bridge Labz
*Perpose:ask the user what type element you wants,sort the integers,strings and doubles.
* this BubbleSort program is Generic type.
**/
public class BubbleSort 
{
	public static  int[] doBubbleSort(int[] numbers)
	   {
	     int temp;
	     for(int i = 0; i < numbers.length; i++)
	        {
	            for(int j = 1; j < (numbers.length); j++)
	            {
	                //if numbers[j-1] > numbers[j], swap the elements
	                if(numbers[j-1] > numbers[j])
	                {
	                    temp = numbers[j-1];
	                    numbers[j-1]=numbers[j];
	                    numbers[j]=temp;
	                }
	            }
	        }
		return numbers;
	 }

public static void main(String[] args)
	{
 	int arr2;
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the size of array");
	int a=s.nextInt();
	int[] arrays=new int[a];
    System.out.println("Enter the value");
    for(int i=0;i<a;i++)
     {
      arrays[i]=s.nextInt();
     }
    int[] arrays2=doBubbleSort(arrays);
    for(int i = 0; i < arrays2.length; i++)
     {
       System.out.print(arrays[i]);
       System.out.print(",");
     }
   }     
}




