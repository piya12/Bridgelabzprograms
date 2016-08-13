package com.bridgelabz.programs.sort;
/*
*Created by :Bridge Labz
*Perpose:ask the user what type element you wants,sort the integers,strings and doubles.
* this InsertionSort program is Generic type.
**/
import com.bridgelabz.util.Utility;
import java.util.Scanner;
public class InsertionSort 
{
	public static void main(String[] args)
	   { 
	      Scanner s=new Scanner(System.in);
	      Utility u=new Utility();
	      System.out.println("Enter the size of array");
	      int a=s.nextInt();
	      int[] arrays=new int[a];
	      System.out.println("Enter the value of "+a);
	      for(int i=0;i<a;i++)
	         {
	           arrays[i]=s.nextInt();
	         }
	      int[] arr2=doInsertionSort(arrays);
	      for(int i:arr2)
	        {
	          System.out.print(i);
	          System.out.print(",");
	        }
	   }
	  public static int[] doInsertionSort(int[] input)
	   {
	     int temp;
	     for(int i=1;i<input.length;i++)
	     {
	     for(int j=i;j>0;j--)
	       {
	         if(input[j]<input[j-1])
	          {
	            temp=input[j];
	            input[j]=input[j-1];
	            input[j-1]=temp;
	          }
	       }
	     }
	     return input;
	   }  
	      
	}


	



