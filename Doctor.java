package com.bridgelabz.programs.clinique;
import com.bridgelabz.util.Utility;
public class Doctor
{
	int did;
	String dname;
	String available;
	String specification;
	Utility u1;
	//adddoctor method
	public void addDoctor()
	{
		u1=new Utility();
		System.out.println("Enter Doctors Details ...");

		System.out.print("Enter Name: ");
		this.dname=u1.inputString();
		System.out.println();

		System.out.print("Enter Id No: ");
		this.did=u1.inputInteger();
		System.out.println();

		System.out.print("Enter specialization: ");
		this. specification=u1.inputString();
		System.out.println();

		System.out.print("Enter availability (1:AM   2:PM  3:both)");
		this. available=u1.inputString();
		System.out.println();
	}
	// Setter and getter method
	public int getDid()
	{
		return did;
	}
	public void setDid(int did) 
	{
		this.did = did;
	}
	public String getDname()
	{
    	return dname;
	}
	public void setDname(String dname)
	{
   	 	this.dname=dname;
	}
	public String getAvailable()
 	{
		return available;
	}
	public void setAvailable(String available) 
	{
		this.available = available;
	}
	public String getSpecification() 
	{
		return specification;
	}
	public void setSpecification(String specification) 
	{
		this.specification = specification;
	}
	//tostring method for displaying  the data in good format
	public String toString()
	{
		return "Doctor [did=" + did + ", dname=" + dname + ",available=" + available + ", specification=" + specification+ "]";
	}
}

