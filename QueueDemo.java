package com.bridgelabz.programs;

/* Banking cash counter 
* Create a Program which creates Banking Cash Counter 
*people 
come in to deposit Cash and withdraw Cash. Have an input panel to add people 
to Queue to either deposit or withdraw money and dequeue the people. Maintain 
the Cash Balance. 
*/
import com.bridgelabz.util.Utility;
import com.bridgelabz.util.Queue;
class QueueDemo
{
	int choice=0;
	Utility u = new Utility();
	Queue q = new Queue(5);
	QueueDemo()
	{
		System.out.println("*****   Queue Demonstration   *****");
		System.out.println("\t1.Add\n\t2.Remove\n\t5.Exit");
		while(choice != 5)
		{
			System.out.print("Enter your option ");
			choice = u.getIntegerInput();
			switch(choice)
			{
				case 1:
				System.out.println("Enter item to add");
				q.add(u.getIntegerInput());
				q.display();
				break;
				case 2:
				q.remove();
				q.display();
				System.out.println("Front item removed");
				break;
				case 3:
				System.exit(0);
				break;
				default:
				System.out.println("Invalid option selected");
				break;
			}
		}
	}
public static void main(String args[])
	{
		new QueueDemo();
	}
}
