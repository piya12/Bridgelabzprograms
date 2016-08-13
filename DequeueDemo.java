package com.bridgelabz.programs;
/* created by : Bridgelabz
* Palindrome Checker
* take a empty deque and add some item in deque,add item in dqueque in front , remove some item in  deque from front and rear
*/
import com.bridgelabz.util.Utility;
import com.bridgelabz.util.Queue;
public class DequeueDemo
=======
//.............deque operations.............
{
	int choice=0;
	Utility u = new Utility();
	Queue q = new Queue(5);
	DequeueDemo()
	{
		System.out.println("*****   Dequeue Demonstration   *****");
		System.out.println("\t1.Add from rear\n\t2.Add from front\n\t3.Remove from front\n\t4.Remove from rear\n\t5.Exit");
		while(choice != 5)
		{
			System.out.print("Enter your option "); // Chosse Option
			choice = u.getIntegerInput();
			switch(choice)
			{
				case 1:
				System.out.println("Enter item to add"); // Add item to Enter
				q.add(u.getIntegerInput());
				q.display();
				break;
				case 2:
				System.out.println("Enter item to add");
				q.addFront(u.getIntegerInput());
				q.display();
				break;
				case 3:
				q.remove();
				q.display();
				System.out.println("Front item removed"); // Remove item
				break;
				case 4:
				q.removeRear();
				q.display();
				//System.out.println("under construction");
				break;
				case 5:
				System.exit(0);
				break;
				default:
				System.out.println("Invalid option selected");
				break;
			}
		}
	}
public static void main(String a[])
	{
		new DequeueDemo();
	}
}
