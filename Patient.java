package com.bridgelabz.programs.clinique;
import com.bridgelabz.util.Utility;
public class Patient
{
	int pid;
	String pname;
	int age;
	int mobile;
    public void setPid(int pid)
	{
		this.pid=pid;
	}
	public int getpid()
	{
 		return pid;
	}
	public void setPname(String pname)
	{
		this.pname=pname;
	}
	public String getPname()
	{
		return pname;
	}
	public void setAge(int age)
	{
		this.age=age;
	}
	public int getAge()
	{
		return age;
	}
	public void setMobile(int mobile)
	{
		this.mobile=mobile;
	}
	public double getMobile()
	{
		return mobile;
	}
    public String toString()
    {
		return "Patients [pid=" + pid + ", pname=" + pname + ", age=" + age + ", mobile=" + mobile + "]";
	}
    public void addPatients()
	{
        Utility u1;
		u1=new Utility();
		System.out.println("Enter Patient Details ...");

		System.out.print("Enter Name: ");
		this.pname=u1.inputString();
		System.out.println();
		
		System.out.print("Enter id: ");
		this.pid=u1.inputInteger();
		System.out.println();
		
		System.out.print("Enter Age: ");
		this.age=u1.inputInteger();
		System.out.println();
		
		System.out.print("Enter mobile Number: ");
		this.mobile=u1.inputInteger();
		System.out.println();
	}
}	

		
		
       

	

