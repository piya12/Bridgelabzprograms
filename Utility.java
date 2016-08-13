package com.bridgelabz.util;
import java.io.BufferedReader; 
import java.io.InputStreamReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Arrays;
import java.io.FileInputStream;
import java.util.Random;
import java.util.*;
import java.util.Date;
// Harmonic 
public class Utility 
{
	public float calHarm(int no)
	{
		float harmonic=0;
		int i;
		for(i=1;i<=no;i++)
			{
			harmonic=harmonic+(1.0f/i);
			}
		return harmonic;
	}


public int getIntegerInput()
	{
		int num=0;
		try{
			num = Integer.parseInt(br.readLine());
		}
		catch(Exception e){
			System.out.println("IO Error you have provide wrong type of input");
		}
		return num;
}
//validate username by checking length
public boolean checkLength(String temp)
{
	int length=temp.length();
	if(length<3)
	{
	return false;
	}
	else
	{
	return true;	
	}
}

 // Clinique utility
 //Function take String in dd/MM/yyyy format and return Date Object
public Date stringToDate1(String date)
	{
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
			try
			{
				return (Date) sdf.parse(date);
			}
			catch(ParseException parseException)
			{
				return null;
			}
	}

//replace username in string
public String replaceUsername(String temp)
	{
		String uname="Hello username";
		uname=uname.replaceAll("username",temp);
		return uname;
	}
//reading Integer Input
public int inputInteger()
{
	try
	{
		try
         {
		   return Integer.parseInt(br.readLine());
		 }
		 catch(NumberFormatException e)
         {
	       System.out.println(e);
		 }
    }
    catch(Exception e)
     {
	    System.out.println(e);
     }
		return 0;
}




//String is anagram or not
public boolean isAnagram(String str1,String str2)
{
int i,j,flag=0;
if(str1.length()==str2.length())
	{
		char ctr1[]=str1.toCharArray();
		char ctr2[]=str2.toCharArray();
		System.out.println(str1.length());
		for(i=0;i<str1.length();i++)
		{
			for(j=0;j<str2.length();j++)
			{
				if(ctr1[i]==ctr2[j])
				{
				flag=1;
				break;
				}
				else
				flag=0;
			}
		}
	}
	if(flag==1)
	return true;
	else
	return false;
}

// BinarySearchList
public int binarySearch(String[] words,String key){
		int first = 0,last = words.length;
		while(first < last){
		int mid = (first+last)/2;
		if(key.compareTo(words[mid]) < 0){
			last = mid;
		}
		else if(key.compareTo(words[mid]) > 0){
			first = mid+1;
		}
		else{
		return mid;
		}
		}	
	return -1;
	}
// HashSet New
BufferedReader br,brfile;	

//constructor for intializing utility class object
public Utility()
    {
	br = new BufferedReader(new InputStreamReader(System.in));
	}

//reading String value
	public String inputString(){
		try{
			return br.readLine();	
		}
		catch(Exception e){
			System.out.println(e);		
		}	
		return "  ";
   }

public String getStringInput()throws Exception
	{
		return br.readLine();
	}
	

	
//reading file data and making it as a string
	public String getFileTexthashset(String fileName){
		try{
			brfile = new BufferedReader(new FileReader(fileName));
			//HashSet hs = new HashSet();
               StringBuffer b=new StringBuffer();
			String line = brfile.readLine();
                        System.out.println(line);
			while(line!=null){
		        b.append(line);
				//hs.add(System.lineSeparator());
				line = brfile.readLine();		
			}
			return b.toString();
		 }

	catch(Exception exception){
			return null;
		}
	}	


	//reading file data and making it as a string
	public String getFileText(String fileName){
		try{
			brfile = new BufferedReader(new FileReader(fileName));
			StringBuilder sb=new StringBuilder();
			String line = brfile.readLine();
			while(line!=null){
				sb.append(line);
				sb.append(System.lineSeparator());
				line = brfile.readLine();		
			}
			return sb.toString();
		 }
		catch(Exception exception){
			return null;
		}
	}
	

	//binary search for integers
	public int binarySearch(int[] numbers,int key){
		int start = 0;
		int end   = numbers.length-1;
		while(start <= end){
			int mid = (start+end)/2;
			if(key == numbers[mid]){
				return mid;			
			}
			else if(key < numbers[mid]){
				end = mid-1;			
			}
			else{
				start = mid+1;			
			}		
		}
		return -1;
	}



	//binary search for strings	
	public int binarySearchString(String key,String[] words){
		int first = 0,last = words.length;
		while(first < last){
		int mid = (first+last)/2;
		if(key.compareTo(words[mid]) < 0){
			last = mid;
		}
		else if(key.compareTo(words[mid]) > 0){
			first = mid+1;
		}
		else{
		return mid;
		}
		}	
	return -1;
	}
   public double getDoubleInput()
	{
		double num=0;
		try{
			num = Double.parseDouble(br.readLine());
		}
		catch(Exception e){
			System.out.println("IO Error you have provide wrong type of input");
		}
		return num;
	}
}

    /* Palindrome

	public String getStringInput()throws Exception
	{
		return br.readLine();
	}
	public char getCharacterInput()throws Exception
	{
		return br.readLine().charAt(0);
	}
	public void pressingEnter()
	{
		Scanner sc = new Scanner(System.in);
		sc.nextLine();
	}
*/


	
	

// Ordered LinkedList

/*BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	public int getIntegerInput()
	{
		int num=0;
		try{
			num = Integer.parseInt(br.readLine());
		}
		catch(Exception e){
			System.out.println("IO Error you have provide wrong type of input");
		}
		return num;
	}
	
	
	
	public char getCharacterInput()throws Exception
	{
		return br.readLine().charAt(0);
	}
	
	public String getStringInput()throws Exception
	{
		return br.readLine();
	}
	
	public void pressingEnter()
	{
		Scanner scan = new Scanner(System.in);
		scan.nextLine();
	}*/
	














