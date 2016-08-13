package com.bridgelabz.programs;
/*
* created by: BridgeLabz
* Date 16/07/2016
* Perpose: An Anagram Detection
*One string is an anagram of another if the second is simply a rearrangement of the first. For example, 'heart' and 'earth' are anagrams
**/
import com.bridgelabz.util.Utility;
import java.util.Arrays;
public class Anagram
{
	public void checkAnagram(String word1,String word2)
	{
		//Removing all white spaces from word1 and word2
		String first=word1.replaceAll("\\s"," ");
		String second=word2.replaceAll("\\s"," ");
		//Initially assuming boolean status as true
		boolean flag=true;
		if(first.length()!=second.length())
		{
			//first and second words doesn't have same length
			flag=false;
		}
		else
		{
			//Changing the characters of both first and second words are converting to char array
			char[] ch1=first.toCharArray();
			char[] ch2=second.toCharArray();
			//Sorting both ch1 and ch2
			Arrays.sort(ch1);
			Arrays.sort(ch2);
			//Checking ch1 and ch2 are equal
			flag=Arrays.equals(ch1,ch2);
		}
		if(flag)
        {
            System.out.println("String are anagrams");
        }
        else
        {
            System.out.println("String are not anagrams");
        }
	}
	public static void main(String[] args)
	{
		Utility u1=new Utility();
		//ask the user enter string
		System.out.print("Enter 1st String :");
		String name1=u1.inputString();
		System.out.print("Enter 2nd String :");
		String name2=u1.inputString();
		Anagram t1=new Anagram();
				t1.checkAnagram(name1,name2);
	}
}
