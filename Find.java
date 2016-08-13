package com.bridgelabz.programs.clinique;
import java.sql.Date;
import java.util.ArrayList;
import java.sql.Date;
import java.util.ArrayList;
import java.sql.Date;
import java.util.ArrayList;
import com.bridgelabz.util.Utility;
import com.bridgelabz.programs.clinique.Appointment;
import com.bridgelabz.programs.clinique.Doctor;
import com.bridgelabz.programs.clinique.Patient;
public class Find 
{ //finding doctor by Id
	public ArrayList<Doctor> FindById( ArrayList<Doctor> al,int did)
	{  Doctor dc=new Doctor();
		ArrayList<Doctor> temp=new ArrayList<Doctor>();
	for(Doctor d:al)
	{
		if(d.getDid()==did)
		{
			temp.add(d);
		}
	}
		return temp;
}
//finding doctor by name
	public ArrayList<Doctor> FindByName(ArrayList<Doctor> al, String dn) 
	{   
		ArrayList<Doctor> temp=new ArrayList<Doctor>();
		for(Doctor d:al)
		{
			if(d.getDname().equals(dn))
			{
			temp.add(d)	;
			}
		}
		return temp;
	}
 //finding doctor by availability
	public ArrayList<Doctor> FindByava(ArrayList<Doctor> al, String as) 
	{
		ArrayList<Doctor> temp=new ArrayList<Doctor>();
		for(Doctor d:al)
		{
			if(d.getAvailable().equals(as))
			{
				temp.add(d);
			}
		}
		return temp;
	}
//finding patients by Id
	public ArrayList<Patient> FindById1(ArrayList<Patient> al1, int fdid1)
	 {
		Patient p=new Patient();
		ArrayList<Patient> temp=new ArrayList<Patient>();
		for(Patient p1:al1)
		{
			if(p1.getpid()==fdid1)
			{
				temp.add(p1);
			}
		}
		return temp;
	}
////finding patients by name
	public ArrayList<Patient> FindByName1(ArrayList<Patient> al1, String dn1) 
	{
		Patient p=new Patient();
		ArrayList<Patient> temp=new ArrayList<Patient>();
		for(Patient p1:al1)
		{
			if(p1.getPname().equals(dn1))
			{
				temp.add(p1);
			}
		}
		return temp;
	}
////finding patients by mobile number
	public ArrayList<Patient> FindByava1(ArrayList<Patient> al1, int as1) 
	{
		Patient p=new Patient();
		ArrayList<Patient> temp=new ArrayList<Patient>();
		for(Patient p1:al1)
		{
			if(p1.getMobile()==as1)
			{
				temp.add(p1);
			}
		}
		return temp;
	}
}
