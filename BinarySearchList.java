package com.bridgelabz.programs;
import java.io.*;
import java.util.Scanner;
import com.bridgelabz.util.Utility;
/*
*Created by :Bridge Labz
*Perpose:ask the user what type element you wants,you can sort the integers,strings and doubles.
* you can search the word or integer or double in the array.if it is found show the position.
* this BinarySearch program is Generic type.
**/
public class BinarySearchList 
{
	public static void main(String[] args)throws Exception
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String search;
        Scanner sc=new Scanner(System.in);
		System.out.println("enter number of  element");
		int a=sc.nextInt();
		String[] p=new String[a];
		System.out.println("enter the element");
		for(int i = 0;i<a;i++)
		{
			p[i]=br.readLine();
          // System.out.println("154"+p[i]);
		}
		System.out.println("Enter the element to be found");
		search = br.readLine();
		Utility u=new Utility();
		int index=u.binarySearch(p,search);
		if(index==(-1))
		{
			System.out.println("entered the element is not there found");
		}
		else
		{
		System.out.println("enter element found at"+index);   
        }
	}
}

	



