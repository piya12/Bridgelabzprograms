package com.bridgelabz.programs.clinique;
/*
* Created by bridgelabz 
*Purpose- We have to manage a doctor list associated with the cliniqe, Manage the patient list associted with clinique
* find the doctor name, id , speacializtion
* search the patient name , id  
*/
import java.util.Date;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import com.bridgelabz.util.Utility;
import com.bridgelabz.programs.clinique.Appointment;
import com.bridgelabz.programs.clinique.Doctor;
import com.bridgelabz.programs.clinique.Find;
import com.bridgelabz.programs.clinique.Patient;
import java.text.SimpleDateFormat;
import java.text.ParseException;

public class Clinique
 {
	public static void main(String[] args) throws ParseException
	{
   		Utility u = new Utility();
		Find f = new Find();
		HashMap<Appointment, Integer> app = new HashMap<Appointment, Integer>();// Appionment is class it allow only the integer
		Clinique c = new Clinique();// creating the obj
		Patient p = new Patient();
		Doctor dc = new Doctor();
		ArrayList<Doctor> al = new ArrayList<Doctor>(); // it is a collection type ,and we passing like generic type doctor
		ArrayList<Patient> al1 = new ArrayList<Patient>();
		char ch;
		do 
		{ 
			System.out.println("*********Welcome to Docotor Management System************");
			System.out.println("Select your operation");
			System.out.println("1.Add doctor");
			System.out.println("2.Add Patients");
			System.out.println("3.Print doctor");
			System.out.println("4.Print Patients");
			System.out.println("5.Take Appoinment");
			System.out.println("6.Print Appoinment");
			System.out.println("7.Serach Doctor by name ,id or Availability");
			System.out.println("8.Serach Patients by name ,id ");
			System.out.println("Enter your choice");
			int s = u.inputInteger();
			switch (s) 
			{
			case 1:
				// calling adddoctor method for adding doctor`
				dc.addDoctor();
				al.add(dc);
				break;
			case 2:
				// calling addpatient method for adding patient
				p.addPatients();
				al1.add(p);
				break;
			case 3:
				// Printing All Doctors Details..
				System.out.println("All Doctors Details..");
				System.out.println(al);
				break;
			case 4:
				// Printing Patients Details..
				System.out.println("All Patients Details..");
				System.out.println(al1);
				break;
			case 5:
				// Enter Doctor id..
				System.out.println("Enter Docotor Id ");
				int did = u.inputInteger();
				ArrayList<Doctor> daa = f.FindById(al, did);
				if (daa != null)
					if (daa.size() >= 1) 
					{
						System.out.println("Enter Date of Appoientmentd (6/07/2016):");
						Date mDate = (Date) u.stringToDate1(u.inputString());
						if (mDate == null)
							System.out.println("Date format is not correct");
						// Checkig for avilability of doctors
						else 
						{
							Appointment newApp = new Appointment(did, mDate);
							if (app.containsKey(newApp)) 
							{
								SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
								System.out.println(dateFormat.format(dateFormat.parse("8/07/2016")));
								// allready some appointment is there on that date
								Integer appointmentOnprasent = app.get(newApp);
								if (appointmentOnprasent <= 5) 
								{
									// Appoientment on given date is less then 5
									appointmentOnprasent++;
									app.put(newApp, appointmentOnprasent);
									System.out.println("Appointment Schedule on" + mDate.toString() + " " + "with Doctor Id" + did);
								} 
								else
								{
									// On given date apppointment is more then 5
									System.out.println("Please Select Another date");
   								}
							} 
							else 
							{
								// No appointment is there on given date
								app.put(newApp, 1);
							}
						}
					}
					// doctor Id does not exit in the DoctorsList
					else
				    {
						System.out.println("Invalid Doctor Id");
					}
				else 
				{
					System.out.println("Invalid Doctor Id");
				}
				break;
			case 6:
				System.out.println("all appoinments..");
				System.out.println(app);
				break;
			case 7:
				System.out.println("1.Search Docotor By id");
				System.out.println("2.Search Docotor By Name");
				System.out.println("3.Search Docotor By Availability");
				int chc = u.inputInteger();
				switch (chc)
			    {
				case 1:
					System.out.println("1.Enter Docotor  id");
					int fdid = u.inputInteger();
					al = f.FindById(al, fdid);
					// search doctor buy id
					System.out.println(al);
					break;
				case 2:
					// Search Doctor by name 
					System.out.println("Enter Docotor Name");
					String dn = u.inputString();
					al = f.FindByName(al, dn);
					System.out.println(al);
					break;
				case 3:
					// search doctor buy Availability
					System.out.println("Enter Docotor Availability");
					String as = u.inputString();
					al = f.FindByava(al, as);
					System.out.println(al);
					break;
				default:
					System.out.println("Invalid choice");
					break;
			    }
				break;
			case 8:
				Find f1 = new Find();
				char ch2;
				System.out.println("1.Search Patients By id");
				System.out.println("2.Search Patients By Name");
				System.out.println("3.Search Patients By Mobile Number");
				int ss = u.inputInteger();
				switch (ss)
			    {
				case 1:
					//// Search Patients By id
					System.out.println("Enter Patients  id");
					int fdid1 = u.inputInteger();
					al1 = f1.FindById1(al1, fdid1);
					System.out.println(al1);
					break;
				case 2:
					// Search Patients By Name
					System.out.println("Enter Patients Name");
					String dn1 = u.inputString();
					al1 = f1.FindByName1(al1, dn1);
					System.out.println(al1);
					break;
				case 3:
					// Search Patients By Mobile Number
					System.out.println("Enter Patients Mobile Number");
					int as1 = u.inputInteger();
					al1 = f1.FindByava1(al1, as1);
					System.out.println(al1);
					break;
				default:
					System.out.println("Invalid choice");
					break;
				}
				break;
			default:
				System.out.println("Invalid choice");
				break;
			}
			System.out.println("\nDo you want to continue (Type y or n) \n");
			ch = u.inputString().charAt(0);
		} while (ch == 'Y' || ch == 'y');
	}
}
