package com.bridgelabz.programs.clinique;
import java.util.Date;
public class Appointment
{   
	Integer did;
    Date date;
    //calling constructure
    public Appointment(int did,Date date )
	{ 
	  this.did=did;
	  this.date=date;
	}
    //calling getter and setter
	public int getDid() 
	{
		return did;
	}
	public void setDid(int did) 
	{
		this.did = did;
	}
	public Date getDate()
    {
		return date;
	}
	public void setDate(Date date)
    {
		this.date = date;
	}
    //calling to string method for displaying  data in proper format
	public String toString() 
    {
		return "Appointment [did=" + did + ", date=" + date +  ",id=]";
	}
    //generating hash code for comparison
	public int hashCode()
	{
    	return this.did.hashCode()+this.date.hashCode();
	}
    public boolean equals(Object object)
    {
    	if (object == null) 
			return false;
    	if (object == this) 
			return true;
    	if (!(object instanceof Appointment))
			return false;
        //creating object of Appointment class
    	Appointment dA = (Appointment) object;
		if((this.did==dA.did) && (this.date.equals(dA.date)))
			return true;
		    else
			return false;
	}
}
	


