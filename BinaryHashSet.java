package com.bridgelabz.programs;
public class BinaryHashSet
{
  public static void main(String[] args)
  {
	Utility u = new Utility();
    String s=u.getFileTexthashset("/home/bridgeit/Documents/Priyanka/JavaTask/abc.text");
    // System.out.println(s);
	String wordlist[]=s.split(" ");
    for(int i=0;i<wordlist.length;i++)
	{
		System.out.println(wordlist[i]);

	}
    System.out.println("enter the word to be searched");
	String search=u.inputString(); 
	int index= u.binarySearchString(search,wordlist);
    if(index==-1)
		{
		  System.out.println("entered word is not there in file ");
		} 	
	else 	
	    {
		  System.out.println("entered word at index="+(index));
		}
  }
}
