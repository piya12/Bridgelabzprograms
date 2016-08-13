package com.bridgelabz.programs;
import com.bridgelabz.util.Utility;
import java.text.*;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.io.*;
class Regular
{
			public static void main(String[] args)throws Exception
{
				//Utility u= new Utility();
				String data="Read in the following message: Hello <<name>>, We have your full name as <<fullname>> in our system. your contact number is 91-xxxxxxxxxx. Please,let us know in case of any clarification Thank you BridgeLabz 01/01/2016.";
				String name = "<<name>>";
				String replaces="priyanka";
				Pattern p1=Pattern.compile(name);
				Matcher m1=p1.matcher(data);
				data=m1.replaceAll(replaces);
				String sn="fullname";
				String replaces2="priyanka bodadkar";
				Pattern p2=Pattern.compile(sn);
				Matcher m2=p2.matcher(data);
				data =m2.replaceAll(replaces2);
				String no="91-(x){10}";
				String contact="7416460273"; 
				Pattern p3= Pattern.compile(no);
				Matcher m3=p3.matcher(data);
				data=m3.replaceAll(contact);
				Date obj1= new Date();
				SimpleDateFormat df= new SimpleDateFormat("dd/mm/yyyy");
				String currentdate =df.format(obj1);
				System.out.println("the current date is ="+currentdate);
				String date1="01/01/2016";
				String replaces4=currentdate;
				Pattern p4=Pattern.compile(date1);
				Matcher m4=p4.matcher(data);
				data= m4.replaceAll(replaces4);
				System.out.println("after replacing output is =");
				System.out.println(data);
				

}
}
